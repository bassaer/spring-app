package com.github.bassaer.springapp;

import com.github.bassaer.springapp.models.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = UserRepository.class)
class SpringAppApplicationTests {

	@Test
	void contextLoads() {
	}

}
