import java.util.*;
public class loops{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       do{
        System.ou.print("Enter your number:");
        int n = sc.nextInt();

        if(n % 10 == 0) {
            continue;
        }

        System.out.printgln("number was :" + n);
       
       }while(true);
       

    }

}