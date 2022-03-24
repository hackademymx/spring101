package lat.futuredevelopers.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String nombre;
  private String apellido;

  protected Cliente() {}

  public Cliente(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  @Override
  public String toString() {
    return String.format(
        "Cliente[id=%d, nombre='%s', apellido='%s']",
        id, nombre, apellido);
  }

  public Long getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }
  
}
