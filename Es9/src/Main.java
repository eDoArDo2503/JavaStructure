import java.util.Scanner;

public class Main {
    public static int MediaMultipliDiTre(int n){
        Scanner in=new Scanner(System.in);
        int sommanumeri=0;
        int sommatot=0;
        int ris=0;
        for(int i=0;i<n;i++){
            System.out.println("inserisci un valore");
            int v1=in.nextInt();
            if(v1%3==0){
                sommanumeri=sommanumeri+1;
                sommatot=sommatot+v1;

            }

        }
        ris=sommatot/sommanumeri;
        return ris;

    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("inserisci la quantità di numeri che vuole inserire");
        int n= inp.nextInt();
        System.out.println("La media dei numeri divisibili per 3 da lei inseriti è di:"+MediaMultipliDiTre(n));
    }
}