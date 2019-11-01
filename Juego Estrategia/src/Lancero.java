
public class Lancero extends Personaje{
	
	public static final int distanciaMinimaAtaque = 1;
	public static final int distanciaMaximaAtaque = 3;
	
	public Lancero(Punto posicion) {
		super(posicion, 150, 25);
	}

	@Override
	public void atacar(Personaje a) {
		if(this.puedeAtacar(a)) {
			a.recibirAtaque(this);
			System.out.println("Lancero infligio un daño de "+this.getDaño()+" puntos!");
		}
		else {
			System.out.println("FUERA DE RANGO O MUERTO.");
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
		
			if (this.estaVivo()==false) {
				throw new MiException (005);
				
			}
			if (this.distancia(a)<Lancero.distanciaMinimaAtaque 
					&& this.distancia(a)> Lancero.distanciaMaximaAtaque) {
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
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return super.toString().concat("TIPO LANCERO");
	}
}