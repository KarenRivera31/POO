import java.util.*;



public class Zoo {
	public static void main(String msg[]) {

		int num=4;
	
		ArrayList<Animal> nZoo = new ArrayList();
		
		nZoo.add(new Caballo("Spirit", 15));
		nZoo.add(new Cuervo("Sierra", 28));
		nZoo.add(new Jaguar("Snow", 9));
		nZoo.add(new Oso("Koda", 3));
		
		
		
		int opc=0;	
		do {
		System.out.println("\n\n\tMENU\n\n"
				+ "1)Mostrar Animales\n"
				+ "2)Agrear Animales\n"
				+ "3)Eliminar Animales\n"
				+ "4)Salir\n");
		opc=captura.Entero("Ingrese la opcion que desea realizar");
		
		switch(opc) {
		case 1: 
			int opc2=0;
			do {
			System.out.println("\n\n\tMENU MOSTAR\n\n"
					+ "Mostrar por:\n"
					+ "1)Nombre Cientifico\n"
					+ "2)Habitad\n"
					+ "3)Longevidad\n"
					+ "4)Clase\n"
					+ "5)Camada\n"
					+ "6)Alimentacion\n"
					+ "7)Situacion\n"
					+ "8)Salir");
			
			opc2=captura.Entero("Ingrese la opcion que desea realizar");
			System.out.println("\n\n");
			
			switch(opc2) {
			case 1: 
				for (int i=0; i<num;i++) {
					nZoo.get(i).nombreCientifico();
				}
				break;

			case 2:
				for (int i=0; i<num;i++) {
					nZoo.get(i).habitad();
				}
				break;
			case 3:
				for (int i=0; i<num;i++) {
					nZoo.get(i).longevidad();
				}
				break;
			case 4:
				for (int i=0; i<num;i++) {
					nZoo.get(i).clase();
				}
				break;
			case 5:
				for (int i=0; i<num;i++) {
					nZoo.get(i).camada();
				}
				break;
			case 6: 
				for (int i=0; i<num;i++) {
					nZoo.get(i).alimentacion();
				}
				break;
			case 7:
				for (int i=0; i<num;i++) {
					nZoo.get(i).situacion();
				}
				break;
			}
			
			}while(opc2!=8);
			
			
			break;
		case 2:
			int opc3=0;
			
			System.out.println("\n\n\tMENU\n\n"
					+ "1)Caballo\n"
					+ "2)Cuervo\n"
					+ "3)Jaguar\n"
					+ "4)Oso\n");
			opc3=captura.Entero("Ingrese el animal que desea agregar");
			System.out.println("\n\n");
			
			num=num+1;
			
			switch(opc3) {
			
			case 1: 
				nZoo.add(new Caballo(captura.String("Nombre del Caballo"), captura.Entero("Edad del Caballo")));
				break;
			case 2:
				nZoo.add(new Cuervo(captura.String("Nombre del Cuervo"), captura.Entero("Edad del Cuervo")));
				break;
			case 3: 
				nZoo.add(new Jaguar(captura.String("Nombre del Jaguar"), captura.Entero("Edad del Jaguar")));
				break;
			case 4:
				nZoo.add(new Oso(captura.String("Nombre del Oso"), captura.Entero("Edad del Oso")));
				break;
			}
			break;
		case 3: 
			int elim=0;
			String name=captura.String("\n\nIngrese el nombre del animal que desea eliminar");
			for (int i=0; i<num; i++) {
				if (name.matches(nZoo.get(i).nombre)) {
					elim= i;
				}
			}
			nZoo.remove(elim);
			num=num-1;
			break;
		}
		
		
		}while(opc!=4);
	}
}
