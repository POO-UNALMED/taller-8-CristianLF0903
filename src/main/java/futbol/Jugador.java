package futbol;
public class Jugador extends Futbolista {
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	public Jugador(String nombre, int edad, String p, short golesMarcados, byte dorsal) {
		super(nombre, edad, p);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	public int compareTo(Object futbolista) {
		int dif;
		int edad1 = this.getEdad();
		int edad2 = ((Futbolista) futbolista).getEdad();
		if(edad2 >= edad1) {
			dif = edad2 - edad1;
		} else {
			dif = edad1 - edad2;
		}
		return dif;
	}
	@Override
	public boolean jugarConLasManos() {
		return false;
	}
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + 
				", y juega de " + this.getPosicion() + 
				" con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
	}

}