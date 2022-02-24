package lat.futuredevelopers.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Persona {

	private String Name;
	
	@Autowired
	private Address myAddress;
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public Address getMyAddress() {
		return myAddress;
	}
	
	public void setMyAddress(Address myAddress) {
		this.myAddress = myAddress;
	}
	
}
