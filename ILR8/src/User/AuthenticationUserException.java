package User;

public class AuthenticationUserException extends Throwable {
    public void authenticationUserException() throws  myException {
        System.out.println("Bag in name or password");
    }

    public class myException extends Exception {

    }
    //AuthenticationUserException authenticationUserException = new AuthenticationUserException();
}
