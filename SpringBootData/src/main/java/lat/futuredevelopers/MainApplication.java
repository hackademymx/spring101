package lat.futuredevelopers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lat.futuredevelopers.models.Cliente;
import lat.futuredevelopers.repositories.ClienteRepository;

@SpringBootApplication
public class MainApplication {

	private static final Logger log = LoggerFactory.getLogger(MainApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ClienteRepository repository) {
	    return (args) -> {
	    	// guardar algunos clientes
	        repository.save(new Cliente("Jack", "Bauer"));
	        repository.save(new Cliente("Chloe", "O'Brian"));
	        repository.save(new Cliente("Kim", "Bauer"));
	        repository.save(new Cliente("David", "Palmer"));
	        repository.save(new Cliente("Michelle", "Dessler"));

	        // traer todos los clientes
	        log.info("Clientes encontrados con findAll():");
	        log.info("-------------------------------");
	        for (Cliente customer : repository.findAll()) {
	          log.info(customer.toString());
	        }
	        log.info("");

	        // traer un cliente por ID
	        Cliente customer = repository.findById(1L);
	        log.info("Cliente encontrado con findById(1L):");
	        log.info("--------------------------------");
	        log.info(customer.toString());
	        log.info("");

	        // traer un cliente por Apellido
	        log.info("cliente encontrado con findByApellido('Bauer'):");
	        log.info("--------------------------------------------");
	        repository.findByApellido("Bauer").forEach(bauer -> {
	          log.info(bauer.toString());
	        });
	        log.info("");	    	
	        repository.delete(repository.findById(2L));
	    };
    }
	
}
