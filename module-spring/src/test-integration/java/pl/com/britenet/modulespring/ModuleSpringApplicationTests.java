package pl.com.britenet.modulespring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Tag("integration")
@SpringBootTest
class ModuleSpringApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
        System.out.println("integration");
        Assertions.assertEquals(2, userRepository.getUsers().size());
    }

}
