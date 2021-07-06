package app;

import java.util.List;

import data.Message;
import data.Reciept;

public interface Messaging {

	public void send(String sender, String reciept, String text)  throws Exception;
	public List<Message> recieveMessages(String reciept)  throws Exception;
	
	
}
