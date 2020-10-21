package futbol;
public abstract class Futbolista implements Comparable <Object>{

	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}
	
	public boolean equals(Futbolista futbolista) {
		boolean aux;
		if (futbolista != this) {
			aux = false;
		} else {
			aux = true;
		}
		return aux;
	}

	public String toString() {
		return "El futbolista " + this.nombre + " tiene " + this.edad + 
				", y juega de " + this.posicion;
	}

	public abstract boolean jugarConLasManos(); 
	
}