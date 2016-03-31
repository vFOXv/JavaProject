package com;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(5959);
        List<ClientHandler> threads = new ArrayList<ClientHandler>();

        while (true) {
            ClientHandler clientHandler = new ClientHandler(serverSocket.accept(), 5959);
            ExecutorService serviceHendler = Executors.newScheduledThreadPool(2);
            FutureTask futureTask = new FutureTask(clientHandler);
            serviceHendler.execute(futureTask);
            threads.add(clientHandler);
            serviceHendler.shutdown();
        }
    }
}
