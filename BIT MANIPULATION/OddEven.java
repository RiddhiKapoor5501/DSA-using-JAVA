import java.util.*;
public class OddEven {

    public static void OddorEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("The given number is even");
        }else{
            System.out.println("The given number is odd");
        }




    }
    public static void main(String args[]) {
        OddorEven(3);
        OddorEven(4);

    }
}