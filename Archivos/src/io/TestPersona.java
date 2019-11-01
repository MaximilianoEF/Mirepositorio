package io;
import java.io.IOException;
import java.util.LinkedList;
//commit
public class TestPersona {

	public static void main(String[] args) throws IOException {
		
		LinkedList <Persona> lista=new LinkedList <Persona>();
		LinkedList <Persona> listaordenadadni=new LinkedList <Persona>();
		LinkedList <Persona> listaordenadaedad=new LinkedList <Persona>();
		
		lista = ArchivoDePersonas.getPersonas("personas.txt");
		System.out.println(lista);
		
		listaordenadadni = ArchivoDePersonas.getPersonaOrdenadoPorDni(lista);
		System.out.println(listaordenadadni);
		
		listaordenadaedad = ArchivoDePersonas.getPersonaOrdenadoPorEdad(lista);
		System.out.println(listaordenadaedad);
		
	}
	
}
