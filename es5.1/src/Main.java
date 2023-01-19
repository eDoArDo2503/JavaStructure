import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static int[] inserisciArray(int n){
        Scanner in=new Scanner(System.in);
        int[] unArray=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Inserisci il valore da inserire nella posizione "+i+" dell'array");
            unArray[i]=in.nextInt();

        }

        return unArray;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Inserisci la dimensione dell'array");
        int d=in.nextInt();
        int []temp = Main.inserisciArray(d);

        for(int i=0; i < temp.length; i++)
            System.out.println(temp[i]);
        }

    }
