package spring_boot_jekins_examples.spring_boot_jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SpringBootJenkinsApplicationTests {

	final public static Logger logger  = LoggerFactory.getLogger(SpringBootJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing...01");
		logger.info("Test case executing...02");
		logger.info("Test case executing...03");
        assertTrue(true);
	}

}
