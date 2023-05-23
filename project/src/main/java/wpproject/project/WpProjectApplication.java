package wpproject.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public abstract class WpProjectApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(WpProjectApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("App has started.");
	}
}
