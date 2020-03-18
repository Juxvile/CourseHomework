package by.itstep.goryachev.tdd.userManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class UserManagerImplTest {


    UserManagerImpl userManager;
    @Before
    public void setUp() throws Exception {
        userManager = new UserManagerImpl();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void addUser() throws Exception {
        User user = new User("Ivan", "Ivanov", 28, "male");
        assertEquals(user, userManager.addUser("Ivan", "Ivanov", 28, "male"));
    }
    
}