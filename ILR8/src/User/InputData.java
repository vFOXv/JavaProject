package User;

import java.util.Scanner;

public class InputData {

    String name;
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    void myInputData() {
        InputData inputData = new InputData();
        System.out.println("Input your name.");
        setName(mySanner());
        System.out.println("Input your password.");
        setPassword(mySanner());
    }

    String mySanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
