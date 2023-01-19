import java.util.Scanner;

public class Main {
    public static int SpazioVocali(String n, String m){
        int sum=0,i=0,x;
        do{
            x=n.indexOf(m,i);
            if(x!=-1){ sum++; i=x+1; }
        }while(x!=-1);
        return sum;
    }


    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String st,s1;
        System.out.println("Inserisci il testo ");
    st=in.nextLine();
System.out.print("Inserisci la parola da cercare:");
    s1=in.nextLine();
System.out.println("La parola è presente  "+SpazioVocali(st,s1)+" volte");

}

}