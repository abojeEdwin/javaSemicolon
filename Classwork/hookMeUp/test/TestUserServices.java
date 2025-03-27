import data.repositories.Users;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.UserService;
import services.UserServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestUserServices {
        UserServiceImpl userServiceImp;
        Users users = new Users();


    @BeforeEach
    public void setUp(){
        users = new Users();
        userServiceImp = new UserServiceImpl(users);
    }

    @Test
    public void testThatUserServicesCanRegister(){
        assertEquals(0, users.count());
        UserServiceImpl userServiceImp = new UserServiceImpl(users);
        userServiceImp.register("choko007","Password");
        assertEquals(1L,users.count());
    }

    @Test
    public void testThatUserServicesDoesNotRegisterIfUserAlreadyExist(){
        assertEquals(0, users.count());
        UserServiceImpl userServiceImp = new UserServiceImpl(users);
        userServiceImp.register("choko007","Password");
        assertThrows(IllegalArgumentException.class,()-> userServiceImp.register("choko007","Password"));
    }

    @Test
    public void testThatUserServicesDoesNotLoginWithoutRegistering(){
        assertEquals(0, users.count());
        UserServiceImpl userService = new UserServiceImpl(users);
        assertThrows(IllegalArgumentException.class,()->userService.login("choko007","Password"));

    }
}
