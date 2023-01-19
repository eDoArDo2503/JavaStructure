import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static String Contrario(String n){
        String contrario= "";
        for (int i = n.length()-1; i >= 0; i--){
            contrario += n.charAt(i);}

        return contrario;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Inserisci la dimensione dell'array");
        String d=in.nextLine();

        System.out.println(Contrario(d));
    }

}