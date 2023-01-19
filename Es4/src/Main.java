import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int [] numeri= new int[10];
         Scanner in=new Scanner(System.in);
        System.out.println("inserisci il primo ,secondo e terzo numero ");
        int n1=in.nextInt();
        numeri[0]=n1;
        int n2=in.nextInt();
        numeri[1]=n2;
        int n3=in.nextInt();
        numeri[2]=n3;
        System.out.println(+numeri[2]+","+numeri[1]+","+numeri[0]);

    }
}