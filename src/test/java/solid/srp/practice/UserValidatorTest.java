package solid.srp.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    @Test
    void whenUserIsValidThenDoesNotThrowException() {
        UserValidator validator = new SimpleUserValidator();
        User user = new User("petr", "123456", "petr@mail.com");

        assertDoesNotThrow(() -> validator.validate(user));
    }

    @Test
    void whenLoginIsBlankThenThrowException() {
        UserValidator validator = new SimpleUserValidator();
        User user = new User("   ", "123456", "petr@mail.com");

        assertThrows(
                IllegalArgumentException.class,
                () -> validator.validate(user)
        );
    }

    @Test
    void whenPasswordTooShortThenThrowException() {
        UserValidator validator = new SimpleUserValidator();
        User user = new User("petr", "123", "petr@mail.com");

        assertThrows(
                IllegalArgumentException.class,
                () -> validator.validate(user)
        );
    }

    @Test
    void whenEmailWithoutAtThenThrowException() {
        UserValidator validator = new SimpleUserValidator();
        User user = new User("petr", "123456", "petrmail.com");

        assertThrows(
                IllegalArgumentException.class,
                () -> validator.validate(user)
        );
    }


}