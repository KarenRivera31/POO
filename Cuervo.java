
public class Cuervo extends Animal{
	public Cuervo(String nombre, int edad){
		super(nombre, edad);
	}
	
	@Override
	public void nombreCientifico(){
		System.out.println("El nombre cientifico de la especie de " + nombre + " es: \tCorvus corax" );	
	}
	
	@Override
	public void habitad(){
		System.out.println(nombre + ": \thabita desde tundras hasta zonas desérticas" );	
	}
	
	@Override
	public void longevidad(){
		System.out.println(nombre + ": \tvive 60 años" );	
	}

	@Override
	public void clase(){
		System.out.println(nombre + ": \tpertenece a la clase Aves" );	
	}
	@Override
	public void camada(){
		System.out.println(nombre + ": \tpuede tener de 4 a 6 huevos" );	
	}
	@Override
	public void alimentacion(){
		System.out.println(nombre + ": \tomnívoro" );	
	}
	
}
