package pl.com.britenet.modulespring;

import org.springframework.stereotype.Repository;
import pl.com.britenet.app_a.User;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {
    public List<User> getUsers() {
        return Arrays.asList(new User("DUMMY1"), new User("DUMMY2"));
    }
}
