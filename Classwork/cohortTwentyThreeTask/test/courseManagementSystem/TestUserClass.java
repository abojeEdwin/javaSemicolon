package courseManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUserClass {
    User user = new User("Aboje Edwin", "abojeedwin@gmail.com","Test123!");

    @BeforeEach
    public void setUp(){
     user = new User("Aboje Edwin", "abojeedwin@gmail.com","Test123!" );
    }

    @Test
    public void testThatUserSetsAndReturnsFullName(){
        assertEquals("Aboje Edwin" , user.getFullName());
    }

    @Test
    public void testThatUserClassReturnsCorrectEmail(){
        assertEquals("abojeedwin@gmail.com",user.getEmail());

    }

    @Test
    public void testThatUserClassReturnsCorrectPassword(){
        assertEquals("Test123!", user.getPassword());
    }

}
