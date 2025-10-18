package kai_yakovchuk.spring_db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "kai_yakovchuk.spring_db")
public class SpringDbApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDbApplication.class, args);
    }
}