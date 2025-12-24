package ls2.extendsLS1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void testNullnameTeacher (){
        assertThrows(IllegalArgumentException.class,() -> new Teacher("", "s1"));
    }

    @Test
    void testNullSubjectTeacher (){
        assertThrows(IllegalArgumentException.class,() -> new Teacher("Olga", ""));
    }

    @Test
    void testNullnameStudent (){
        assertThrows(IllegalArgumentException.class,() -> new Student("", "A1"));
    }

    @Test
    void testNullGroupStudent (){
        assertThrows(IllegalArgumentException.class,() -> new Student("Dima", ""));
    }

    @Test
    void whenValidStudentThenNoException() {
        assertDoesNotThrow(() -> new Student("Ann", "B-02"));
    }

}