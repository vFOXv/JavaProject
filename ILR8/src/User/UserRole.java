package User;

public enum UserRole {

    TEACHER("Teacher"),
    STUDENT("Student"),
    ADMIN("Admin");

    private String userRole;

    UserRole(String userRole) {
        this.userRole = userRole;
    }
}
