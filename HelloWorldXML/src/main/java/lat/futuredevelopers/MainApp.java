package lat.futuredevelopers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lat.futuredevelopers.demo.HelloWorld;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objeto = (HelloWorld) context.getBean("helloWorld");
		System.out.println("Tu Mensaje : " + objeto.getMensaje());
		HelloWorld objetoConstructor = (HelloWorld) context.getBean("helloWorldConstructor");
		System.out.println("Tu Mensaje : " + objetoConstructor.getMensaje());
	}

}
