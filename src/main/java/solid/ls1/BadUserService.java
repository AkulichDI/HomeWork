package solid.ls1;

public class BadUserService {


    public void register(String login, String password, String email) {
        if (login == null || login.isBlank()) {
            throw new IllegalArgumentException("Login is invalid");
        }
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password is invalid");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email is invalid");
        }

        System.out.println("Save user to database: " + login);
        System.out.println("Send email to: " + email);
    }
}
