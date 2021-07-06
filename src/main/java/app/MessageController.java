package app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import data.Message;

@RestController("/app")
public class MessageController {

	@Autowired
	private Messaging messaging;
	
	@RequestMapping ("/send")
	public void send(
			@RequestParam String sender,
			@RequestParam String reciept, 
			@RequestParam String message) throws Exception {
	
		messaging.send(sender, reciept, message);
	}


	@RequestMapping ("/recieveMessages")
	public List<Message> recieveMessages(@RequestParam String reciept) throws Exception {
		return messaging.recieveMessages(reciept);
	}

	

}
