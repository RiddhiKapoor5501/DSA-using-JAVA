import java.util.*;
public class loops{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       boolean IsPrime = true;
      // for(int i=2; i<=n-1; i++) 
       for(int i=2; i<=Math.sqrt(n); i++) {
           if(n % i ==0 ) {
            IsPrime= false;
           }
       }

       if(IsPrime == true) {
        System.out.println("n is prime");
        
       }else{
        System.out.println("n is not prime");
       }  
       

    }

}