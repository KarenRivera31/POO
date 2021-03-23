
public class Banco{
	public static void main(String [] args){
		Cuenta c1= new Cuenta();
		
		int opc, ope;
		do {
			
		System.out.println("\n\n\t\t MENU \n\n"
				+ "1._ Crear una nueva cuenta.\n"
				+ "2._ Ingresar a una cuenta existente.\n"
				+ "3._ Salir.");
		
		opc=capturaEntrada.capturarEntero("Ingrese la opcion que desea realizar");
		
		switch (opc) {
		case 1:
			System.out.println("\n\n\tNUEVA CUENTA");
			c1.setNombre(capturaEntrada.capturarString("Ingrese el nombre completo del titular"));
			c1.setPin(capturaEntrada.capturarEntero("Cree un pin que utilizara para acceder a su cuenta"));
			//System.out.println("Desea realizar un deposito");
			c1.setSaldo(capturaEntrada.capturarFloat("Cantidad de deposito"));
			break;
		case 2:
			System.out.println("\n\n\tCUENTA EXISTENTE\n\n");
			
			String name=capturaEntrada.capturarString("Ingrese el nombre completo del titular");
			name.toUpperCase();
			String nombre = c1.getNombre();
			nombre.toUpperCase ();
			if (nombre.matches(name)) {
				int pin = capturaEntrada.capturarEntero("\n\tIngrese el PIN para dar acceso a la cuenta");
				if (pin==c1.getPin()) {
					
					do {
						System.out.println("\n\n\tSE ENTRO A LA CUENTA\n\n"
								+ "Nombre: " + nombre + "\n"
								+ "IPN: " + c1.getPin() + "\n"
								+ "Saldo: " + c1.getSaldo() + "$\n");
						System.out.println("\n\tSUB-MENU\n\n"
								+ "1._Retirar.\n"
								+ "2._Depositar.\n"
								+ "3._Salir.");
						ope=capturaEntrada.capturarEntero("Que operacion desea realizar");
						
						switch (ope) {
						case 1:
							float dinero = capturaEntrada.capturarFloat("\nCuanto retirara?");
							if (dinero < c1.getSaldo()) {
								dinero = c1.getSaldo()-dinero;
								c1.setSaldo(dinero);
							}
							else {
								System.out.println("\n\n\tNo tiene suficiente saldo");
							}
							System.out.println("\n\nSu saldo ahora es de " + c1.getSaldo());
							
							break;
						case 2:
							dinero = capturaEntrada.capturarFloat("\nCuanto depositara?");
							
							dinero = c1.getSaldo()+dinero;
							c1.setSaldo(dinero);
						
							System.out.println("\n\nSu saldo ahora es de " + c1.getSaldo());
							
							break;
						}
					}while(ope!=3);
				}
				else {
					System.out.println("\n\tEl PIN es incorrecto");
				}
			}
			else {
				System.out.println("\n\n\tNo se encontro la cuenta.");
			}
			break;
		}	
	}while(opc!=3);
	}
}
