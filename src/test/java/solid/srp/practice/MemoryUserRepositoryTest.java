package solid.srp.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemoryUserRepositoryTest {

    @Test
    void whenSaveUserThenExistsByLogin() {
        UserRepository repository = new MemoryUserRepository();
        User user = new User("petr", "123456", "petr@mail.com");

        repository.save(user);

        assertTrue(repository.existsByLogin("petr"));
    }

    @Test
    void whenUserWasNotSavedThenDoesNotExistByLogin() {
        UserRepository repository = new MemoryUserRepository();

        assertFalse(repository.existsByLogin("petr"));
    }

    @Test
    void whenSaveTwoUsersThenBothExistByLogin() {
        UserRepository repository = new MemoryUserRepository();

        User petr = new User("petr", "123456", "petr@mail.com");
        User oleg = new User("oleg", "qwerty123", "oleg@mail.com");

        repository.save(petr);
        repository.save(oleg);

        assertTrue(repository.existsByLogin("petr"));
        assertTrue(repository.existsByLogin("oleg"));
    }


    @Test
    void whenSaveUserWithDuplicateLoginThenThrowException() {
        UserRepository repository = new MemoryUserRepository();

        User first = new User("petr", "123456", "petr@mail.com");
        User second = new User("petr", "abcdef", "other@mail.com");

        repository.save(first);

        assertThrows(
                IllegalArgumentException.class,
                () -> repository.save(second)
        );
    }



}