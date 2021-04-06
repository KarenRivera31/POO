
public class Caballo extends Animal{
	
	public Caballo(String nombre, int edad){
		super(nombre, edad);
	}
	
	@Override
	public void nombreCientifico(){
		System.out.println("El nombre cientifico de la especie de " + nombre + " es: \tEquus caballus" );	
	}
	
	@Override
	public void habitad(){
		System.out.println(nombre + ": \thabita zonas esteparias" );	
	}
	
	@Override
	public void longevidad(){
		System.out.println(nombre + ": \tvive de 25 a 30 días" );	
	}
	
	@Override
	public void alimentacion(){
		System.out.println(nombre + ": \thervivoro" );	
	}
	
}
