import java.util.Scanner;

public class Main {
    public static String PositivoNegativo(){
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int p=0;
        int b=0;
        boolean b1=false;
        boolean b2=false;

        while(n1!=0) {
            if(n1>0) {
               p=n1;
                b1=true;

                if(b<0)
                    b2=true;
            }

            if((n1 < 0) && b1 == true)
                b=n1;

            System.out.println("inserisci un vaolore");
            n1= in.nextInt();
        }

        if(p>0 && b<0&&b1==true)
            return "OK";
        else
            return "NO";
    }
    public static void main(String[] args) {
        System.out.println(PositivoNegativo());
    }
}