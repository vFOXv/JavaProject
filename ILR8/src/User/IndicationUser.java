package User;

public class IndicationUser {

    InputData inputData;
    ArrayUser arrayUsers;
    static ArrayUser key[];
    //AuthenticationUserException authenticationUserException;

    IndicationUser(InputData inputData, ArrayUser arrayUsers) {
        this.inputData = inputData;
        this.arrayUsers = arrayUsers;
        //this.authenticationUserException = authenticationUserException;
    }

    protected void myIndicationUser() {
        IndicationUser indicationUser = new IndicationUser(inputData, arrayUsers);
        String myUser[] = {inputData.getName(), inputData.getPassword()};
        AuthenticationUserException authenticationUserException = new AuthenticationUserException();
        ArrayUser[][] users = arrayUsers.getUsers();

        int i = 0;
        for (int j = 0; j < users[i].length; j++) {
            for (i = 0; i <= users.length - 2; i++) {
                if (users[i][j].equals(myUser[j])) {
                    if (users[i][j].equals(myUser[j]) && i == users.length - 2) {
                        key  = new ArrayUser[]{users[i][j], users[i][j], users[i][j]};
                    }
                } else {
                    authenticationUserException.authenticationUserException();
                    continue;
                }
            }
        }
        System.out.println(key);
    }
}
