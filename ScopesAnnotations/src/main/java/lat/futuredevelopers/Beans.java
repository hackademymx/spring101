package lat.futuredevelopers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import lat.futuredevelopers.demo.Persona;

public class Beans {
	
	@Bean(name="personaSingleton")// <bean name="" class="" scope="" />
	@Scope("singleton")
	public Persona getPersonaSingleton() {
		return new Persona();
	}
	
	@Bean(name="personaPrototype")
	@Scope("prototype")
	public Persona getPersonaPrototype() {
		return new Persona();
	}
}
