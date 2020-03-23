package by.itstep.goryachev.tdd.userManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;


public class UserManagerImplTest {
    User user = new User("Ivan", "Ivanov", 28, "male");
    @Test
    public void addUser1() throws Exception {

    }


    UserManagerImpl userManager;
    @Before
    public void setUp() throws Exception {
        User user = new User("Ivan", "Ivanov", 28, "male");
        userManager = new UserManagerImpl();
    }

    @After
    public void tearDown() throws Exception {
        userManager = null;
        user = null;
    }

    @Test
    public void addUserWhenSafeUniqueUser() throws Exception {
//        assertEquals(user, userManager.addUser("Ivan", "Ivanov", 28, "male"));
        userManager.addUser("Ivan", "Ivanov", 28, "male");
        assertTrue(userManager.userList.contains(user));
        userManager.addUser("Ivan", "Ivanov", 28, "male");
        assertEquals(1, Collections.frequency(userManager.userList, user));
    }
    @Test
    public void addUserWhenSafeNotUniqueUser() throws Exception {
        userManager.addUser("Ivan", "Ivanov", 28, "male");
        userManager.addUser("Ivan", "Ivanov", 28, "male");
        assertEquals(1, Collections.frequency(userManager.userList, user));
    }

}