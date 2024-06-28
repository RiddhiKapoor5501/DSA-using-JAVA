import java.util.*;
public class binomial {

    public static int factorial(int a){
       int f = 1;

        for(int i=1; i<=a; i++){
          f = f*i;
        
        }
        return f;
    }



public static int binomialCoff(int n, int r){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);

    int binomialCoff = fact_n/(fact_r*fact_nmr);
    return binomialCoff;
}
    public static void main(String args[]) {
        System.out.println(binomialCoff(5,2));


    }
}