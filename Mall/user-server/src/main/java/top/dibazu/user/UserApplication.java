package top.dibazu.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import top.dibazu.user.entity.User;
import top.dibazu.user.repository.UserRepository;

import java.util.List;

@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @Bean
    public CommandLineRunner dataLoader(UserRepository userRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                User user = new User();
                user.setUsername("admin");
                List<User> userList = userRepository.findUserByUsername(user.getUsername());
                if (userList == null || userList.isEmpty()) {
                    user.setNickname("nickname");
                    user.setAddress("address");
                    user.setPassword("admin");
                    user.setPhone("11122223333");
                    user.setAuthority(1);
                    userRepository.save(user);
                }
            }
        };
    }
}
