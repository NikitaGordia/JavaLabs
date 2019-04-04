package com.nikitagordia.view;

import com.nikitagordia.model.Client;

import java.util.Scanner;

public class ClientView {

    private Scanner scanner;

    public ClientView() {
        scanner = new Scanner(System.in);
    }


    public String read() {
        suggestInput();
        return scanner.nextLine();
    }

    public void sayHello(Client[] clients) {
        System.out.println("Hello");
        System.out.println("\tAll list:");
        write(clients);
    }

    public void suggestInput() {
        System.out.println();
        System.out.println("Print [inner/outer/exit] :");
    }

    public void alert(String message) {
        System.out.println(message);
    }

    public void write(Client[] clients) {
        if (clients.length == 0) {
            System.out.println("\tResult set empty(");
        } else {
            System.out.println("\tResult (" + clients.length + " clients):");
            for (int i = 0; i < clients.length; i++)
                System.out.println("\t\t[" + (i + 1) + "] " + clients[i]);
            System.out.println();
        }
    }
}
