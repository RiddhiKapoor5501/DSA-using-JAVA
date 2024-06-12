import java.util.*;
public class loops{
    public static void main(String args[]) {
        //int counter = 0;
       // while(counter<100){
         //   System.out.println("Hello Riddhi");
         //   counter++;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum = sum+i;
            i++;
        } 
        System.out.println(sum);
    }

}