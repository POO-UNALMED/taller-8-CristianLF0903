package futbol;
public class Portero extends Futbolista {

	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	}
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " +
				this.getEdad()+", y juega de "+ this.getPosicion()+ " con el dorsal " + this.dorsal + 
				". Le han marcado " + this.golesRecibidos;
	}
	public int compareTo(Object portero) {
		int dif;
		short goles1 = this.golesRecibidos;
		short goles2 = ((Portero) portero).golesRecibidos;
		if(goles2 >= goles1) {
			dif = goles2 - goles1;
		} else {
			dif = goles1 - goles2;
		}
		return dif;
	}

}