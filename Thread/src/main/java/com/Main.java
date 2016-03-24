package com;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Animal myAnimal = new Animal("Murzic", "cat", 5, 10);
        OutputThread outputThread = new OutputThread();

        try {
            outputThread.fileStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            outputThread.ran(outputThread.file, myAnimal);
        } catch (IOException e) {
            e.printStackTrace();
        }


        InputThread inputThread = new InputThread();

        try {
            inputThread.ran(outputThread.file);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class OutputThread {

    File file;
    public void fileStream() throws IOException {
        file = new File("D:/newfile.txt");
        if (file.createNewFile()) {
            System.out.println("Новый файл создан");
        } else {
            System.out.println("Файл уже существует");
        }
    }

    public void ran(File file, Animal myAnimal) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(myAnimal);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}

class InputThread {
    public Animal ran(File file) throws IOException, ClassNotFoundException {
        Animal cloneAnimelsObj = null;
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object myObj = objectInputStream.readObject();
        System.out.println("InputThread ---->" +myObj.toString());
        return cloneAnimelsObj;
    }
}
