package kg.ort.www.initialization;

import kg.ort.www.entity.Role;
import kg.ort.www.entity.User;
import kg.ort.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;

@Component
public class DataInitializer {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public DataInitializer(UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostConstruct
    public void Init() {

        User admin = new User();
        admin.setName("admin");
        admin.setUsername("admin@gmail.com");
        admin.setPassword(passwordEncoder.encode("admin"));
        admin.setRoles(Collections.singleton(Role.ADMIN));
        userService.addUser(admin);

        User user = new User();
        user.setName("user");
        user.setUsername("user@gmail.com");
        user.setPassword(passwordEncoder.encode("user"));
        user.setRoles(Collections.singleton(Role.USER));
        userService.addUser(user);
    }
}
