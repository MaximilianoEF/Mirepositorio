package io;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class ArchivoDePersonas {

	public static LinkedList<Persona> getPersonas(String miLista) throws FileNotFoundException{
		
		LinkedList<Persona> lista = new LinkedList<Persona>();
		//Creamos un archivo y utilizamos el metodo scanner para leerlo
		File f = new File(miLista);
		Scanner sc = new Scanner(f);
		sc.useLocale(Locale.ENGLISH);
		
		while(sc.hasNext()) {
			//En la lista agregar, siguiente entero de la lectura del archivo, siguiente string de la lectura del archivo...
			lista.add(new Persona(sc.nextInt(), sc.next(), sc.nextInt()));
		}
		
		sc.close();
		return lista;
	}
	
	public static  LinkedList<Persona> getPersonaOrdenadoPorDni(LinkedList<Persona> list) throws IOException {
		
		
		LinkedList <Persona> ordenadasPorDni=new LinkedList <Persona>();
		for(Persona p : list) {
			ordenadasPorDni.add(p);}
		Collections.sort(ordenadasPorDni);
		
		//Metodo de escritura en un archivo
		PrintWriter salida=new PrintWriter(new FileWriter("personasOrdenadasPorDni.txt"));
		Iterator<Persona> it1 = list.iterator();

        while (it1.hasNext()){

            Persona tmp = it1.next();
            salida.println(tmp);

        }
		
		salida.close();
		
		return ordenadasPorDni;
		
	}
	
	public static void listarPersona(LinkedList<Persona> lista, String nombreDeSalida) throws IOException{
		
		PrintWriter salida=new PrintWriter(new FileWriter(nombreDeSalida));
		Iterator<Persona> it1 = lista.iterator();

        while (it1.hasNext()){

            Persona tmp = it1.next();
            salida.println(tmp.toString());

        }
		
		salida.close();
		
	}
	
	public static LinkedList<Persona> getPersonasMayoresAedad(LinkedList<Persona> list, int edad) throws IOException {
		
		LinkedList <Persona> mayoresAedad=new LinkedList <Persona>();

		for(Persona p : list) {
			if(p.getEdad()>edad) {
		mayoresAedad.add(p);}}
		
		PrintWriter salida=new PrintWriter(new FileWriter("mayoresAedad.out"));
		for(Persona p : mayoresAedad) {
			salida.println(p);
		}
		
		salida.close();
		
		return mayoresAedad;
		
	}

	}
