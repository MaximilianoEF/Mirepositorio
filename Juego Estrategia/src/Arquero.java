import java.util.Objects;

public class Arquero extends Personaje{
	
	private int flechas;
	public static final int distanciaMinimaAtaque = 2;
	public static final int distanciaMaximaAtaque = 5;
	
	public Arquero(Punto posicion) {
		super(posicion, 50, 5);
		this.flechas = 20;
	}

	@Override
	public void atacar(Personaje a) {
		if(this.puedeAtacar(a)) {
			this.flechas --;
			a.recibirAtaque(this);
			System.out.println("Arquero infligio un daño de "+this.getDaño()+" puntos!");
		}else if(this.flechas == 0){
			System.out.println("SIN FLECHAS.");
		}
		else {
			System.out.println("fUERA DE RANGO O MUERTO.");
		}
		
	}
	@Override
	public void recibirAtaque(Personaje a) {
		this.setSalud(this.getSalud()-a.getDaño());
		
	}
	
	@Override
	public boolean puedeAtacar(Personaje a) {
		
		boolean puedeAtacar=true;
		
		try {
			if (a.estaVivo()==false) {
				throw new MiException(001);
				
			}
			if (this.flechas<=0) {
				throw new MiException (007);
				
			}
			if (this.estaVivo()==false) {
				throw new MiException (005);
				
			}
			if (this.distancia(a)<Arquero.distanciaMinimaAtaque && this.distancia(a)> Arquero.distanciaMaximaAtaque) {
				throw new MiException (002);
				
			}
			
		}
		catch (MiException fail) {
			System.out.println(fail.getMensaje());
			puedeAtacar=false;
		}
			return puedeAtacar; 
	}
	
	public void cargarFlechas() {
		this.flechas+=6;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(flechas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arquero other = (Arquero) obj;
		return flechas == other.flechas;
	}

	@Override
	public String toString() {
		return super.toString().concat("TIPO ARQUERO").concat("\t").concat("Flechas ").concat(String.valueOf(this.flechas));
	}
	
}
