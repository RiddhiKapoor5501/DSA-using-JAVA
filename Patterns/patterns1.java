import java.util.*;
public class patterns1 { 
   public static void main(String args[]) {
        int n = 5;
        int totaol_number_of_line = n;
        int spaces = n-1;
        int stars = 1;

        int curren_number_of_line = 1;

        while(curren_number_of_line <= totaol_number_of_line){
            for(int i=1; i<=spaces;i++){
                System.out.print(" ");
            }

            for(int i = 1; i<=stars; i++ ){
                System.out.print("*");
            }

            System.out.println();
            curren_number_of_line++;
            spaces--;

            stars ++;



        }

    }
}