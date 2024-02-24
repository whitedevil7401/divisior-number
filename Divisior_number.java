//import java.util.Scanner;

public class Divisior_number {
    static void divisior (int n ){

        for (int i = 1; i*i <n ;i++ ){
            if (n%i == 0) {
                if (n%i==i)
                    System.out.println( " " + i);
                else
                    System.out.println(i+" "+n/i+ " ");
            }
        }
    }
    public static void main (String []args){
      

    System.out.println("divisior are 100");
    divisior(176);;
    }
}
