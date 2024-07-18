import java.util.*;
public class Setbits {

    public static int CountSetBits(int n) {
        int count =0;
        while(n>0){
            if((n & 1) != 0){  //and is done t compare lsb
                count++;


            }
            n = n>>1;
            
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(CountSetBits(10));

    }
}
