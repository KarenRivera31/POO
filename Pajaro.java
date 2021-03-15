
public class Pajaro {
	String name;
	int fuerza;
	
	public Pajaro(String name, int fuerza) {
		this.name=name;
		this.fuerza=fuerza;
	}
	
	public void getNombre() {
		System.out.println("\nNombre: " + name + ".");
	}
	
	public void bloquesDerribados(int sec){
		int num=fuerza*2*sec;
		System.out.println("\nDerribo " + num + " bloques.");
	}
	
	public void cargando(){
		System.out.println(name + " se subio a la resortera.");
	}
	
	public void color(String color) {
		System.out.println("Color: " + color + ".");
	}
	public void poder(String poder) {
		System.out.println("Poder: " + poder + ".");
	}
}
