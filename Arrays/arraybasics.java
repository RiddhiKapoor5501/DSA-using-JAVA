import java.util.*;
public class arraybasics {
    public static void main(String args[]){
        int marks[] = new int[50]; 

       Scanner sc = new Scanner(System.in);

       marks[0] = sc.nextInt();//math
       marks[1] = sc.nextInt();//physics

       System.out.println("phy" + marks[0]);
       System.out.println("math" + marks[1]);



    }


}