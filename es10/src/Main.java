import java.util.Scanner;

public class Main {
    public static int ripetizioni(int a){
        Scanner in=new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        for(int i=0;i<a;i++){
            System.out.println("inserisci il carattere");
            String c = in.nextLine();
            System.out.println(c.charAt(0));
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("inserisci le volte da ripetere");
       int a=in.nextInt();
        ripetizioni(a);
    }
}