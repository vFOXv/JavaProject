package Socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        Animals myArrayAnimals[] = myArray.getArrayAnimals();

        int serverPort = 1313;
        String address = "127.0.0.1";

        try {
            InetAddress ipAddress = InetAddress.getByName(address);
            Socket socket = new Socket(ipAddress, serverPort);

            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            InputStream inputStream = socket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            for (int i = 0; i < myArray.myArrayAnimals().length; i++) {
                System.out.println("OutputStream --->" + myArrayAnimals[i]);
                objectOutputStream.writeObject(myArray.myArrayAnimals()[i]);
                objectOutputStream.flush();
            }
            System.out.println(" ");
            Object tmp = null;
            while((tmp = objectInputStream.readObject()) != null){
                Animals animal = (Animals) tmp;
                System.out.println("InputStream ---->" + animal);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
// врое код ты принципеально не меняла - где я протупил? когда ты считывал оюъект на стороне
//сервера у тебя было как-то так
//while(inputObjectStream.readObject()!=null){=== здесь ты считываешь 1-ый объект -
//Object object = inputObjectStream.readObject();--здесь ты считываешь уже 2-ой объект)
//по-правильному в 46 строчке, ты должен оперировать тем же объектом, который ты считал в 45
//и т.д
// ок) понял, импуты и оутпуты - просто пменяла последовательность их расположения?
//да, вообще редко влияет..но тут это принципиально было..пока не открыть поток оутпут, к инпуту он не пускает)
//то-есть зависание происходило именно из-за того, что канала по обмену еще нет как такового, а мы уже подготовили  инпут
//в моемнт, когда ты проихводишь инициализацию оутпута - у тебя появляется канал, поэтому
//взятие потока ввода - уже не проблема)
// круто) и еще вопрос - как добавить поле в объект - нуже же новый шаблон?(класс)? а у меня на сервере только объект
//тебе нужно просто модифицировать один из парамтеров/атрибутов объекта, ничего по факту(новых полей) добавлять не надо
// т.е. типа - поле с сегодняшней датой не вводить, а изменить имя или вес?угу)
//поле с датой я приводила в качестве примера) у тебя сейчас бизнес-логика другая
//поэтмоу можешь поменять либо имя, либо вес и все)
// ок спасибо большое) хорошо отпразновать)спасибо)))) и тебе хорошего дня) если-что пингуй)