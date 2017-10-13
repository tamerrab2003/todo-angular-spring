package com.dev.ToDo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class ToDoApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void findAllTest() {
		String body = this.restTemplate.getForObject("/api/items", String.class);
		assertThat(body).isNotEmpty();
	}

}
