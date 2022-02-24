package lat.futuredevelopers;

import org.springframework.context.annotation.Bean;

import lat.futuredevelopers.demo.Address;
import lat.futuredevelopers.demo.HelloWorld;
import lat.futuredevelopers.demo.Persona;

public class Beans {

	@Bean
	public Address getHelloWorld() {
		Address myhome = new Address();
		myhome.setNumber(200);
		myhome.setStreet("Aldama");
		return myhome;
	}
	
	@Bean
	public Persona getPersona() {
		Persona persona = new Persona();
		persona.setName("Maria");
		return persona;
	}
	

}
