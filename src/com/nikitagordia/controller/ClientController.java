package com.nikitagordia.controller;

import com.nikitagordia.util.ClientContainer;
import com.nikitagordia.util.ConsoleParser;
import com.nikitagordia.view.ClientView;

public class ClientController {

    private ClientView view;

    public ClientController() {
        view = new ClientView();
    }

    public void run() {
        ClientContainer container = new ClientContainer(10, 143L);
        view.sayHello(container.getClients());

        String input = view.read();
        while (!ConsoleParser.isExit(input)) {
            long innerRequest = ConsoleParser.isInnerRequest(input);
            if (innerRequest != -1) {
                view.write(container.filterByInnerCall(innerRequest));
            } else if (ConsoleParser.isOuterRequest(input)) {
                view.write(container.filterByOuterCall());
            } else {
                view.alert("Unrecognized command(");
            }

            input = view.read();
        }
    }
}
