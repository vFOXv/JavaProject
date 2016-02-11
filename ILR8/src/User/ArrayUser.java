package User;

public class ArrayUser {

    UserRole userRole;
    private ArrayUser[][] users = null;
    ArrayUser(String name, String passvord, UserRole userRole) {
        this.userRole = userRole;
    }

    protected ArrayUser[][] myArrayUser() {

        ArrayUser admin = new ArrayUser("Name1", "A1", UserRole.ADMIN);
        ArrayUser teacher = new ArrayUser("Name2", "A2", UserRole.TEACHER);
        ArrayUser student1 = new ArrayUser("Name3", "A3", UserRole.STUDENT);
        ArrayUser student2 = new ArrayUser("Name4", "A4", UserRole.STUDENT);
        ArrayUser student3 = new ArrayUser("Name5", "A5", UserRole.STUDENT);

        setUsers(new ArrayUser[][]{{admin}, {teacher}, {student1}, {student2}, {student3}});

        return getUsers();
    }

    public ArrayUser[][] getUsers() {
        return users;
    }

    public void setUsers(ArrayUser[][] users) {
        this.users = users;
    }
}
