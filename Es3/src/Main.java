import java.util.Scanner;

public class Main {
    public static int contaRipetuti(int[] val, int n) {
        int sum = 0;
        for (int i = 0; i < val.length; i++) {
            if (n == val[i]) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static void main (String[]args ){
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci il numero da ricercare nella lista di array");
        int b = in.nextInt();
        int[] a = {1, 2, 3, 4,1};
        System.out.println(contaRipetuti(a, b));
    }
}
