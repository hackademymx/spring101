package lat.futuredevelopers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lat.futuredevelopers.demo.HelloWorld;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Beans.class);
		HelloWorld objeto = (HelloWorld) context.getBean("helloWorld");
		System.out.println("Tu Mensaje : " + objeto.getMensaje());
		HelloWorld objetoConstructor = (HelloWorld) context.getBean("helloWorldConstructor");
		System.out.println("Tu Mensaje : " + objetoConstructor.getMensaje());
	}
	
}
