import java.util.Scanner;

public class Main {
    public static boolean CercaElemento(int[] val, int n) {
        boolean b = false;
        for (int i = 0; i < val.length; i++) {
            if (n == val[i]) {
                b = true;
                i=val.length;
            }


        }
        return b;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("inserisci il numero da ricercare nella lista di array");
        int n=in.nextInt();
        int [] a={1,2,3,4};
        System.out.println(CercaElemento(a, n));

    }
}