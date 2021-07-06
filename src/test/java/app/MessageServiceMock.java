package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import data.Message;

public class MessageServiceMock implements Messaging {
	
	
	List<Message> messages = new ArrayList<Message>();
	Map<String, List<Message>> map = new HashMap<String, List<Message>>();
	
	
	public MessageServiceMock() {
		Message m1= new Message("Hello", "Lilach");
		Message m2= new Message("How are you", "Lilach");
		Message m3= new Message("Bye", "Lilach");
		Message m4= new Message("Hello", "Sigal");
		messages.add(m1);
		messages.add(m2);
		messages.add(m3);
		messages.add(m4);
		map.put("Yulia", messages);
	}
		

	
	@Override
	public void send(String sender, String reciept, String text) {
		Message message = new Message(text, sender);
		if (map.get(reciept) == null) { 
		    map.put(reciept, new ArrayList<Message>());
		}
		map.get(reciept).add(message); 

	}

	@Override
	public List<Message> recieveMessages(String reciept) {
		
		return map.get(reciept);
	}

}
