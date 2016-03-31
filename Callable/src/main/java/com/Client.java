package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.*;

public class Client implements Callable<String> {
    private Socket socket;
    private int port;

    public Client(Socket socket, int port) {
        this.socket = socket;
        this.port = port;
    }


    @Override
    public String call() {
        try {
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader readerFromConsole = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String message = readerFromConsole.readLine();//считываю сообщение с клавиатуры
                printWriter.println(message);//ушло на сервер от клиента
                printWriter.flush();
                String msgFromServer = bufferedReader.readLine();
                //пробуем считать ответ от сервера(принять сообщение от хендлера)
                System.out.println("Client -> message from handler is: " + msgFromServer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Hello! Is Clent!";

    }

    public static void main(String[] args) throws IOException {
        String messag ;
        ExecutorService service = Executors.newScheduledThreadPool(2);
        InetAddress inetAddress = InetAddress.getLocalHost();
        Socket socket = new Socket(inetAddress, 5959);
        FutureTask futureTask1 = new FutureTask(new Client(socket, 5959));
        service.execute(futureTask1);
        Future<?> future = service.submit(futureTask1);

        try {
            messag = (String) future.get();
            System.out.println(messag);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}
