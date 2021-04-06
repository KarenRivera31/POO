
public class Oso extends Animal{
	public Oso(String nombre, int edad){
		super(nombre, edad);
	}

	@Override
	public void nombreCientifico(){
		System.out.println("El nombre cientifico de la especie de " + nombre + " es: \tUrsus maritimus" );	
	}
	
	@Override
	public void habitad(){
		System.out.println(nombre + ": \thabita regiones árticas" );	
	}
	
	@Override
	public void longevidad(){
		System.out.println(nombre + ": \tvive de 25 a 30 años" );	
	}
	
	@Override
	public void situacion(){
		System.out.println(nombre + ": \tla especie se encuentra amenazada" );	
	}
}
