package Socket;

import java.io.*;
import java.lang.reflect.Field;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws ClassNotFoundException {
        MyArray myArray = new MyArray();
        Animals animals = new Animals();
        int port = 1313;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Waiting for a client...");

            Socket socket = serverSocket.accept();
            System.out.println("---->Connect<----");

            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            InputStream inputStream = socket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            Object tmp = null;
            while ((tmp = objectInputStream.readObject()) != null) {
                try {
                    Animals animal = (Animals) tmp;
                    System.out.println("InputStream ---->" + animal);
                    Field field = animal.getClass().getDeclaredField("name");
                    field.setAccessible(true);
                    field.set(animal, animal.getName() + "TEST");
                    System.out.println("OutputStream --->" + animal);
                    objectOutputStream.writeObject(animal);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
