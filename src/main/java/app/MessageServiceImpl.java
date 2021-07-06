package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import data.Message;


@Service
public class MessageServiceImpl implements Messaging{

	Map<String, List<Message>> map = new HashMap<String, List<Message>>();
	
	@Override
	public void send(String sender, String reciept, String text) throws Exception {
		if(reciept == null || reciept.equals("")) {
			throw new Exception("Reciept is unKnown : " + reciept);
		}
		Message message = new Message(text, sender);
		if (map.get(reciept) == null) { 
		    map.put(reciept, new ArrayList<Message>());
		}
		map.get(reciept).add(message); 
	}

	@Override
	public List<Message> recieveMessages(String reciept) throws Exception{
		List<Message> messages = map.get(reciept);
		if(messages == null) {
			throw new Exception("No messages For you "+ reciept);
		}
			
		return map.get(reciept);
	}

}
