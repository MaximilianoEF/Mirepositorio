package io;
//Java io es input / output, en este paquete se encuentra todo lo necesario para la entrada y salida de datos de java.
import java.io.IOException;
import java.util.LinkedList;
//commit
public class TestPersona {

	public static void main(String[] args) throws IOException {
		
		LinkedList <Persona> lista=new LinkedList <Persona>();
		LinkedList <Persona> listaordenadadni=new LinkedList <Persona>();
		LinkedList <Persona> listamayoredad=new LinkedList <Persona>();
		
		lista = ArchivoDePersonas.getPersonas("personas.txt");
		System.out.println(lista);
		System.out.println();
		listaordenadadni = ArchivoDePersonas.getPersonaOrdenadoPorDni(lista);
		System.out.println(listaordenadadni);
		System.out.println();
		listamayoredad = ArchivoDePersonas.getPersonasMayoresAedad(lista, 10);
		System.out.println(listamayoredad);
		ArchivoDePersonas.listarPersona(lista, "Salida.txt");
		
	}
	
}
