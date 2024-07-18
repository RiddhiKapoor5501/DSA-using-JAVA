import java.util.*;
public class Pow {

    public static boolean PowerOfTwo(int n){
        if((n & (n-1)) == 0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]) {
        System.out.println(PowerOfTwo(4));
        System.out.println(PowerOfTwo(5));

    }
}