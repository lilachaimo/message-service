package data;

import lombok.Data;

@Data
public class Reciept {

	private String name;

	public Reciept(String name) {
		this.name = name;
	}
	
	
}
