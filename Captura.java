import java.util.Scanner;

public class Captura {
	public static int Entero(String msg) {
		Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return(sc.nextInt());
	}
	
	public static float Float(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+ msg+": ");
        return(sc.nextFloat());
    }
	
	public static String String(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+ msg+": ");
        return(sc.nextLine());
	}
}
