package lat.futuredevelopers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lat.futuredevelopers.demo.HelloWorld;
import lat.futuredevelopers.demo.Persona;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Beans.class);
		/*HelloWorld objeto = context.getBean(HelloWorld.class);
		System.out.println("Tu Mensaje : " + objeto.getMensaje());
		System.out.println("Your Message : " + objeto.getMessage());*/
		
		Persona objeto = context.getBean(Persona.class);
		System.out.println(objeto.getMyAddress().getStreet());
		
		
	}

}
