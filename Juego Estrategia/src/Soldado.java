import java.util.Objects;

public class Soldado extends Personaje implements Bebible{
	
	public static final int distanciaAtaque = 1;
	private int energia;
	
	public Soldado(Punto posicion) {
		super(posicion, 200, 10);
		this.energia = 100;
	}

	@Override
	public void atacar(Personaje a) {
		if(this.puedeAtacar(a)) {
			a.recibirAtaque(this);
			this.energia--;
			System.out.println("Soldado infligio un daño de "+this.getDaño()+" puntos!");
		}
		else if(this.energia == 0) {
				System.out.println("SIN ENERGIAS PARA ATACAR.");
				this.tomarPocion();
		}
		else {
			System.out.println("FUERA DE RANGO O PERSONAJE MUERTO.");
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
			if (this.energia<0) {
				throw new MiException (006);
				
			}
			if (this.estaVivo()==false) {
				throw new MiException (005);
				
			}
			if (this.distancia(a)!=Soldado.distanciaAtaque) {
				throw new MiException (002);
				
			}
			
		}
		catch (MiException fail) {
			System.out.println(fail.getMensaje());
			puedeAtacar=false;
		}
			return puedeAtacar; 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(energia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Soldado other = (Soldado) obj;
		return energia == other.energia;
	}

	@Override
	public void tomarPocion() {
		if(this.energia<=0)
		this.energia=100;
	}
	
	@Override
	public String toString() {
		return super.toString().concat("TIPO SOLDADO").concat("\t").concat("ENERGIA ").concat(String.valueOf(this.energia));
	}
	
}