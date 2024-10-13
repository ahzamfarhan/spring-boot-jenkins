package spring_boot_jekins_examples.spring_boot_jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsApplication {

	final public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

	@PostConstruct
	public void init() {

		logger.info("Application started successfully...");
	}

	public static void main(String[] args) {
		logger.info("Application executed successfully...");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
