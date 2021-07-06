package com.lilachyonash.messageservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import app.MessageController;

@SpringBootTest
class MessageServiceApplicationTests {

	@Autowired
	private MessageController controller;
	
	@Test
	void contextLoads() throws Exception{
		assertThat(controller).isNotNull();
	}
	
	
	

	
}
