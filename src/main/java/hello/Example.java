package hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(properties.AcmeProperties.class)
public class Example {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Example.class, args);
	}
}
