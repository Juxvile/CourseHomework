package by.itstep.goryachev.tdd.userManager;



import java.util.ArrayList;
import java.util.List;

public class UserManagerImpl implements UserManager{
    List <User> userList = new ArrayList<User>();

    @Override
    public User addUser(String firstname, String lastname, int age, String sex) {
        return new User(firstname,lastname,age,sex);
    }
}
