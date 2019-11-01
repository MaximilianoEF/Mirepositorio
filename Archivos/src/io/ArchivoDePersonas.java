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
		File f = new File(miLista);
		Scanner sc = new Scanner(f);
		sc.useLocale(Locale.ENGLISH);
		
		while(sc.hasNext()) {
			lista.add(new Persona(sc.nextInt(), sc.next(), sc.nextInt()));
		}
		
		sc.close();
		return lista;
	}
	
	public static  LinkedList<Persona> getPersonaOrdenadoPorDni(LinkedList<Persona> list) throws IOException {
		
		LinkedList <Persona> ordenadasPorDni=new LinkedList <Persona>();
		Collections.sort(list);
		for(Persona p : list) {
		ordenadasPorDni.add(p);}
		
		PrintWriter salida=new PrintWriter(new FileWriter("personasOrdenadasPorDni.txt"));
		for(Persona p : ordenadasPorDni) {
			salida.println(p);
		}
		
		salida.close();
		
		return ordenadasPorDni;
		
	}
	
public static  LinkedList<Persona> getPersonaOrdenadoPorEdad(LinkedList<Persona> list) throws IOException {
		
		LinkedList <Persona> ordenadasPorEdad=new LinkedList <Persona>();
		Collections.sort(list, new Comparator<Persona>(){

		    @Override
		    public int compare(Persona p1, Persona p2) {
		        return p1.getEdad().compareTo(p2.getEdad());
		    }
		});
		for(Persona p : list) {
		ordenadasPorEdad.add(p);}
		
		PrintWriter salida=new PrintWriter(new FileWriter("personasOrdenadasPorEdad.txt"));
		for(Persona p : ordenadasPorEdad) {
			salida.println(p);
		}
		
		salida.close();
		
		return ordenadasPorEdad;
		
	}

	}
