package CentroEducativo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudiante")
public class Estudiante {
	@Id
	private int id;
	private String nombre, apellido_1, apellido_2;

	public Estudiante() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_1() {
		return apellido_1;
	}

	public void setApellido_1(String apellido_1) {
		this.apellido_1 = apellido_1;
	}

	public String getApellido_2() {
		return apellido_2;
	}

	public void setApellido_2(String apellido_2) {
		this.apellido_2 = apellido_2;
	}

	@Override
	public String toString() {
		return nombre + apellido_1 + apellido_2;
	}
	
	
}