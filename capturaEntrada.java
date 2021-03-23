import java.util.Scanner;

public class capturaEntrada {
    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return(sc.nextInt());
    }
    
    public static float capturarFloat(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+ msg+": ");
        return(sc.nextFloat());
    }
    
    public static String capturarString(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+ msg+": ");
        return(sc.next());
    }
}