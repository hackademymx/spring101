package lat.futuredevelopers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lat.futuredevelopers.bean.HelloWorld;

@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner {

	@Autowired
	HelloWorld helloWorld;
	
	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	public void run(String... arg0) throws Exception {
		System.out.println("Mensaje: "+ helloWorld.getMensaje());
	}
	
}
