package com.nikitagordia.controller;

import com.nikitagordia.exception.UnrecognizedComand;
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
            try {
                long innerRequest = ConsoleParser.parseInnerRequest(input);
                if (innerRequest != -1) {
                    view.write(container.filterByInnerCall(innerRequest));
                } else if (ConsoleParser.parseOuterRequest(input)) {
                    view.write(container.filterByOuterCall());
                } else {
                    throw new UnrecognizedComand(input);
                }
            } catch (Exception e) {
                view.alert(e.getMessage());
            }

            input = view.read();
        }
    }
}
