import java.util.*;
public class functions{
    public static void printHellworld() {
        System.out.println("Hello World");
    }


    public static int calculateSum(int a,int b )//parameters 
    {
       // Scanner sc. = new Scanner(Suystem.in);
       // int a = sc.nextInt();
       // int b = sc.nextInt();
        int sum = a + b;
         //System.out.println();
        return sum;

    }



    public static void main(String args[]) {
        //printHelloWorld();//to call the function
        //calculateSum();
        // swap - valuess exchange
        int a = 5;
        int b = 10;
        
        // swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a=" +a);
        System.out.println("a=" +b);

    



    }
}