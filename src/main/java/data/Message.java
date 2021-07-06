package data;

import lombok.Data;

@Data
public class Message {
	
	private String text;
	private String sender;
	
	
	public Message(String text, String sender) {
		this.text = text;
		this.sender = sender;
	}


	@Override
	public String toString() {
		return sender +": "+ text ;
	}
	
	
	

}
