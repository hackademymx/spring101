package lat.futuredevelopers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import lat.futuredevelopers.models.Cliente;
import lat.futuredevelopers.repositories.ClienteRepository;

public class Beans {
	
	@Bean
	public void demo(@Autowired ClienteRepository repository) {
    	// guardar algunos clientes
        repository.save(new Cliente("Jack", "Bauer"));
        repository.save(new Cliente("Chloe", "O'Brian"));
        repository.save(new Cliente("Kim", "Bauer"));
        repository.save(new Cliente("David", "Palmer"));
        repository.save(new Cliente("Michelle", "Dessler"));

        // traer todos los clientes
        System.out.println("Clientes encontrados con findAll():");
        System.out.println("-------------------------------");
        for (Cliente customer : repository.findAll()) {
          System.out.println(customer.toString());
        }
        System.out.println("");

        // traer un cliente por ID
        Cliente customer = repository.findById(1L);
        System.out.println("Cliente encontrado con findById(1L):");
        System.out.println("--------------------------------");
        System.out.println(customer.toString());
        System.out.println("");

        // traer un cliente por Apellido
        System.out.println("cliente encontrado con findByApellido('Bauer'):");
        System.out.println("--------------------------------------------");
        repository.findByApellido("Bauer").forEach(bauer -> {
          System.out.println(bauer.toString());
        });
        System.out.println("");
    }
}
