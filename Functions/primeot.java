import java.util.*;
public class primeot {

   public static boolean IsPrime(int n){
      if(n == 2){
        return true;
      }
      for(int i = 2; i<=Math.sqrt(n); i++){
        if(n % i ==0){
            return false;
        }
      }
      return true;
   }
   public static void primesInRange(int n){
       for(int i =2; i<=n;i++){
        if(IsPrime(i)){//true
            System.out.println(i+" ");
        }
       }
       System.out.println(); 
   }
   public static void main(String args[]) {
      //System.out.println(IsPrime(7));
      primesInRange(20);
    }
}