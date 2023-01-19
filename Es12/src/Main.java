import java.util.Scanner;

public class Main {
    public static int SpazioVocali(String n){
        int sum=0;
        for (int i = 1;i<n.length() ; i++){
            if(n.charAt(i-1)==' '&& (n.charAt(i)=='a'||n.charAt(i)=='u'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o')) {
                sum = sum+1;
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Inserisci la stringa:");
        String d=in.nextLine();
        System.out.println(SpazioVocali(d));
    }

}