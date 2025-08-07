package in.rajk;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.password.PasswordEncoder;

import in.rajk.model.AppUser;
import in.rajk.model.Member;
import in.rajk.repository.MemberRepository;
import in.rajk.repository.UserRepository;

// ✅ Add import
import io.github.cdimascio.dotenv.Dotenv;

@EnableRetry
@EnableScheduling
@SpringBootApplication
public class GymByRajApplication {

    public static void main(String[] args) {
        SpringApplication.run(GymByRajApplication.class, args);
    }

}
