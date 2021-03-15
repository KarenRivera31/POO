
public class Personaje extends Pajaro {
	public Personaje(String name, int fuerza) {
		super(name, fuerza);
	}
	
	public void rojo() {
		getNombre();
		color("rojo");
		poder("bajo");
		System.out.println("Ataque: Derriba bloques.");
	}
	
	public void amarillo() {
		getNombre();
		color("amarillo");
		poder("medio");
		System.out.println("Ataque: Derriba bloques.");
	}
	
	public void negro() {
		getNombre();
		color("negro");
		poder("fuerte");
		System.out.println("Ataque: Derriba bloques.");
	}
}
