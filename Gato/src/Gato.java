
public class Gato {
	
	private String nombre;
	private int edad;
	
	
	public Gato() {
		this.nombre=null;
		this.edad=0;
	}
	
	public Gato(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public int edadGato(int edad) {
		return edad*5;
	}
	
}
