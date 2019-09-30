
public abstract class Personaje {

	private Punto posicion;
	private double salud;
	private int da�o;
	
	public Personaje(Punto posicion, double salud, int da�o) {
		this.da�o = da�o;
		this.posicion = posicion;
		this.salud = salud;
	}
	
	public abstract void atacar(Personaje a);
	public abstract void recibirAtaque(Personaje a);
	public abstract boolean puedeAtacar(Personaje a);
	
	protected void setSalud(double salud) {
		this.salud = salud;
	}

	protected double getSalud() {
		return salud;
	}

	protected int getDa�o() {
		return da�o;
	}

	public boolean estaVivo() {
		return (this.salud>0);
	}
	
	public void moverse(Punto posicion) {
		this.posicion = posicion;
	}
	
	public double distancia(Personaje a) {
		return this.posicion.distancia(a.posicion);
	}

	@Override
	public String toString() {
		return "INFO Personaje: ".toString().concat("POSICION ").concat(String.valueOf(this.posicion)).concat("\t").concat("SALUD ").concat(String.valueOf(this.salud)).concat("\t").concat("DA�O ").concat(String.valueOf(this.da�o)).concat("\t\t");
	}
}
