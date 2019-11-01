package io;
import java.util.Objects;

//commit

public class Persona implements Comparable<Persona>{

	private int edad;
	private Integer dni;
	private String apellido;

	public Persona(Integer dni,String apellido , int edad) {
		super();
		this.edad = edad;
		this.dni = dni;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "edad= " + edad + " dni= " + dni + " apellido= " + apellido+"\n";
	}

	@Override
	public int compareTo(Persona otraPersona) {
		
		return this.dni.compareTo(otraPersona.dni);
	}

	public Integer getEdad() {
		return edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		Persona other = (Persona) obj;
		return (this.dni == other.dni);
	}
	
	
}


	
