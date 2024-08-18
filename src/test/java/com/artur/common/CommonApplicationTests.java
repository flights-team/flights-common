package com.artur.common;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = CommonApplicationTests.TestApplication.class)
class CommonApplicationTests {

	@Test
	void contextLoads() {
	}

	@SpringBootApplication
	public static class TestApplication{
		public static void main(String[] args) {
			SpringApplication.run(Test.class, args);
		}
	}

}
