package lat.futuredevelopers.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import lat.futuredevelopers.models.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

	  List<Cliente> findByApellido(String apellido);

	  Cliente findById(long id);
}
