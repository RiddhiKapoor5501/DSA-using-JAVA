import java.util.*;
public class forloop{
    public static void main (String args[]){
        //to print the last digit  of a number
     /*int n = 10899;

     while(n>0){
        int lastDigit = n%10;
        System.out.println(lastDigit + " ");
        n = n/10;
     } 
     System.out.println();  */
     // to save the reverse 
        int n = 10899;
        int rev = 0;

     while(n>0){
         int lastDigit = n % 10;
         rev = (rev*10) + lastDigit;
         
         n=n/10;
         

     }
     System.out.println(rev);
       
     



    }
}