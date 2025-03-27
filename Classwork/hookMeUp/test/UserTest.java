import data.repositories.Users;
import data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @BeforeEach
    public void setUp() {
        Users users = new Users();
    }

    @Test
    public void testThatUserClassCanSaveUsers(){
        Users users = new Users();
        User user = new User("username", "password");
        users.save(user);
        assertEquals(1,users.count());
    }

    @Test
    public void testThatUserClassCanFindUserById(){
        Users users = new Users();
        User user = new User("username", "password");
        user.setId(1);
        user.setUsername("username");
        users.save(user);
        assertEquals(user,users.findUserById(1));
    }

    @Test
    public void testThatUserClassCanDeleteUser(){
        Users users = new Users();
        User user = new User("username", "password");
        user.setId(1);
        user.setUsername("username");
        users.save(user);
        assertEquals(1,users.count());
        users.delete(user);
        assertEquals(0,users.count());
    }

    @Test
    public void testThatUserIsNotNullBeforeDeletingUser(){
        Users users = new Users();
        User user = new User("username", "password");
        user.setId(1);
        user.setUsername("username");
        users.save(user);
        assertThrows(IllegalArgumentException.class, () -> users.delete(null));
    }

    @Test
    public void testThatUserCanDeleteId(){
        Users users = new Users();
        User user = new User("username","password");
        user.setId(1);
        user.setUsername("username");
        users.save(user);
        users.delete(1);
        assertEquals(0,users.count());
    }

    @Test
    public void testThatUserIsNotNullBeforeDeletingUserById(){
        Users users = new Users();
        User user = new User("username", "password");
        user.setUsername("username");
        users.save(user);
        assertThrows(IllegalArgumentException.class, () -> users.delete(null));
    }

    @Test
    public void testThatUserCanFindAllUsers(){
        Users users = new Users();
        User user = new User("username", "password");
        user.setId(1);
        user.setUsername("username");
        users.save(user);
        List<User> arr = new ArrayList<>();
        arr.add(user);
        assertEquals(arr,users.findAll());
    }



}
