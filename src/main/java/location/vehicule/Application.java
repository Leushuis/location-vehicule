package location.vehicule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "location.vehicule")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
