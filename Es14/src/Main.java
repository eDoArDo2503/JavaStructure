import java.util.Scanner;

public class Main {
    public static int ContinuaFino(){
        int sum=0;
        int i=0;
        while ((i<0&&i%2==0)||(i>=0&&i%3==0)){
            sum=sum+i;

            Scanner in=new Scanner(System.in);
            i=in.nextInt();
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(ContinuaFino());
    }
}