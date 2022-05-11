package ar.edu.unlam.pb2;

import java.util.Objects;

public class Jugador {

	private String nombre;
	private String apellido;
	private Double valor;
	private Integer edad;

	public Jugador(String nombre, String apellido, Double valor, Integer edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.valor = valor;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(nombre, other.nombre);
	}
	
	

}
