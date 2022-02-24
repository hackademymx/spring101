package lat.futuredevelopers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lat.futuredevelopers.demo.Persona;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Persona personaSingletonA = context.getBean("personaSingleton", Persona.class);
		Persona personaSingletonB = context.getBean("personaSingleton", Persona.class);
		
		personaSingletonA.setNombre("Angeles");
		System.out.println("Tu Nombre : " + personaSingletonB.getNombre());
		
		Persona personaPrototypeA = context.getBean("personaPrototype", Persona.class);
		Persona personaPrototypeB = context.getBean("personaPrototype", Persona.class);
		
		personaPrototypeA.setNombre("Angeles");
		System.out.println("Tu Nombre : " + personaPrototypeB.getNombre());
		
	}

}
