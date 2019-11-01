
public class TestJuego {

	public static void main(String[] args) {
	
		Arquero arquerito = new Arquero(new Punto(0,0));
		System.out.println(arquerito);
		Arquero arquerazo = new Arquero(new Punto(3,1));
		System.out.println(arquerazo);
		Caballero caballerito = new Caballero(new Punto(3,5));
		System.out.println(caballerito);
		Caballero caballerazo = new Caballero(new Punto(4,6));
		System.out.println(caballerazo);
		Soldado soldadito = new Soldado(new Punto(4,0));
		System.out.println(soldadito);
		Soldado soldadon = new Soldado(new Punto(5,0));
		System.out.println(soldadon);
		Lancero lancerito = new Lancero(new Punto(0,3));
		System.out.println(lancerito);
		Lancero lancerazo = new Lancero(new Punto(2,4));
		System.out.println(lancerazo);
		System.out.println();
		
		
		//comentario para prueba de git
		arquerito.atacar(arquerazo);
		System.out.println();
		arquerito.atacar(arquerazo);
		System.out.println();
		arquerito.atacar(arquerazo);
		System.out.println();
		arquerito.atacar(arquerazo);
		System.out.println();
		arquerito.atacar(arquerazo);
		System.out.println();
		System.out.println(arquerito);
		arquerito.cargarFlechas();
		System.out.println();
		System.out.println(arquerazo);
		System.out.println(arquerito);
		System.out.println();
		
		
		caballerito.atacar(caballerazo);
		System.out.println();
		caballerito.atacar(caballerazo);
		System.out.println();
		caballerito.atacar(caballerazo);
		System.out.println();
		caballerito.atacar(caballerazo);
		System.out.println();
		caballerito.atacar(caballerazo);
		System.out.println();
		System.out.println(caballerito);
		System.out.println(caballerazo);
		
		System.out.println();
		System.out.println(soldadito);
		System.out.println(soldadon);
		System.out.println();
	
		for(int i=0; i<100; i++) {
			soldadito.atacar(soldadon);
		}
		
		System.out.println(soldadito);
		soldadito.atacar(soldadon);
		System.out.println(soldadito);
		
		
		lancerito.atacar(lancerazo);
		System.out.println();
		lancerito.atacar(lancerazo);
		System.out.println();
		lancerito.atacar(lancerazo);
		System.out.println();
		lancerito.atacar(lancerazo);
		System.out.println();
		System.out.println(lancerito);
		System.out.println(lancerazo);
		
	}
}
