import org.junit.Test;
import pl.com.britenet.app_a.User;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void toStringShouldReturnUserName() {
        final String USER_NAME = "Janusz Stefan Sebastian";
        User user = new User(USER_NAME);
        assertEquals(USER_NAME, user.toString());
    }
}
