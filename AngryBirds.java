
public class AngryBirds {
	public static void main(String ags[]) {
		Personaje p[]=new Personaje[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("\n\t\tPERSONAJES\n"
					+ "\tRojo.\n"
					+ "\tChuck.\n"
					+ "\tBomb.");
			p[i]=new Personaje(Captura.String("\n   Ingresa el nomnbre del personaje con el que desea jugar"), Captura.Entero("   Nivel de fuerza al lanzar al personaje (1, 2 o 3)"));
			
			String name=p[i].name;
			
			if (name.matches("rojo")||name.matches("Rojo")) {
				p[i].rojo();
				p[i].bloquesDerribados(1);
			}
			
			if (name.matches("chuck")||name.matches("Chuck")) {
				p[i].amarillo();
				p[i].bloquesDerribados(2);
			}
			
			if (name.matches("bomb")||name.matches("Bomb")) {
				p[i].negro();
				p[i].bloquesDerribados(3);
			}
		}
	}
}
