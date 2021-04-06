
public class Jaguar extends Animal{
	public Jaguar(String nombre, int edad){
		super(nombre, edad);
	}

	@Override
	public void nombreCientifico(){
		System.out.println("El nombre cientifico de la especie de " + nombre + " es: \tPanthera onca" );	
	}
	
	@Override
	public void habitad(){
		System.out.println(nombre + ": \thabita selva tropical, pantanos y campo abierto, incluso desiertos y pastizales" );	
	}
	
	@Override
	public void longevidad(){
		System.out.println(nombre + ": \tvive 20 años en cautiverio" );	
	}
	
	@Override
	public void situacion(){
		System.out.println(nombre + ": \tla especie se encuentra en peligro de extincion" );	
	}
}
