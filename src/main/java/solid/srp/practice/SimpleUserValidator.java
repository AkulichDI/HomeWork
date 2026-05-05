package solid.srp.practice;

public class SimpleUserValidator implements UserValidator {

    @Override
    public void validate(User user) {

        if (user == null) {
            throw new IllegalArgumentException("User must not be null");
        }

        var login = user.getLogin();
        var email = user.getEmail();
        var password = user.getPassword();

        if (login == null || login.isBlank()) {
            throw new IllegalArgumentException("Invalid login provided");
        }
        if (password == null || password.isBlank() || password.length() < 6) {
            throw new IllegalArgumentException("Invalid password provided");
        }
        if (email == null || email.isBlank() || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email provided");
        }


    }





}
