public class Main {
    public static int somma(int [] val){
       int sum=0;
       for ( int i=0; i<val.length; i++){
           sum=sum+val[i];
       } return sum;
    }
    public static void main(String[] args) {
        int [] val={1,-2};
        System.out.println("la somma è di:" +somma(val));


    }
}