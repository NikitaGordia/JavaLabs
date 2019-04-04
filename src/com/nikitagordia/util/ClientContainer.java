package com.nikitagordia.util;

import com.nikitagordia.model.Client;

import java.util.Random;

public class ClientContainer {

    private Client[] clients;

    public ClientContainer(int n, Long seed) {
        Random rand;

        if (seed == null) {
            rand = new Random();
        } else {
            rand = new Random(seed);
        }

        n = Math.max(10, n);

        clients = new Client[n];
        for (int i = 0; i < n; i++)
            clients[i] = new Client(
                    StaticInfo.getFirstNames()[rand.nextInt(StaticInfo.getFirstNames().length)],
                    StaticInfo.getSecondNames()[rand.nextInt(StaticInfo.getSecondNames().length)],
                    StaticInfo.getPatronymic()[rand.nextInt(StaticInfo.getPatronymic().length)],
                    StaticInfo.getAddress()[rand.nextInt(StaticInfo.getAddress().length)],
                    Math.abs(rand.nextLong()),
                    Math.abs(rand.nextLong()) * rand.nextInt(2)
            );
    }

    public Client[] filterByInnerCall(long limit) {
        int count = 0;
        for (int i = 0; i < clients.length; i++)
            if (clients[i].getInnerCallTime() > limit) count++;

        Client[] result = new Client[count];
        count = 0;
        for (int i = 0; i < clients.length; i++)
            if (clients[i].getInnerCallTime() > limit) result[count++] = clients[i];

        return result;
    }

    public Client[] filterByOuterCall() {
        int count = 0;
        for (int i = 0; i < clients.length; i++)
            if (clients[i].getOuterCallTime() > 0L) count++;

        Client[] result = new Client[count];
        count = 0;
        for (int i = 0; i < clients.length; i++)
            if (clients[i].getOuterCallTime() > 0L) result[count++] = clients[i];

        return result;
    }

    public Client[] getClients() {
        return clients;
    }
}
