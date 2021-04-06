
public class Animal {
	String nombre;
	int edad;

		public Animal(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		}
		

		public void dormir(){
			System.out.println(nombre + " \tduerme" );	
		}
		
		public void comer(){
		System.out.println(nombre + ": \testa comiendo" );	
		}
		
		public void clase(){
			System.out.println(nombre + ": \tpertenece a la clase Mammalia" );	
		}
		
		public void situacion(){
			System.out.println(nombre + ": \tla especie se encuentra estable" );	
		}
		
		public void camada(){
			System.out.println(nombre + ": \tpuede tener de 1 a 3 crias" );	
		}
		
		public void alimentacion(){
			System.out.println(nombre + ": \tcarnivoro" );	
		}
		
		
		public void nombreCientifico(){
			System.out.println("" );	
		}
		
		public void habitad(){
			System.out.println(nombre + "" );	
		}
		
		public void longevidad(){
			System.out.println(nombre + "" );	
		}
		
}
