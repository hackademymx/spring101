package lat.futuredevelopers;

import org.springframework.context.annotation.Bean;

import lat.futuredevelopers.demo.HelloWorld;

public class Beans {
	
	@Bean(name="helloWorld")
	public HelloWorld getHelloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMensaje("Hola Mundo, set");
		return helloWorld;
	}
	
	@Bean(name="helloWorldConstructor")
	public HelloWorld getHelloWorldConstructor() {
		return new HelloWorld("Hola Mundo, constructor");
	}
}
