import java.util.*;
public class Operations {

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask)==1){
            return 1;
        }else{
            return 0;
        }
        
    

    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if(newBit == 0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }

    public static int clearIthBits(int n, int i){
        int bitMask = ~(0);
        return n & bitMask;
    }

    public static int clearRangeOfIthBits(int n, int i, int j){
        int a = (~(0)<<(j+1));
        int b = ((1<<i)-1);
        int bitMask = a | b;
        return n & bitMask;

    }


    






   public static void main(String args[]) {
    System.out.println(getIthBit(10, 2));
    System.out.println(setIthBit(10, 2));
    System.out.println(clearIthBit(10, 2));
    System.out.println(updateIthBit(10, 2, 0));
    System.out.println(clearIthBits(10, 2));
    System.out.println(clearRangeOfIthBits(10, 2, 4));



   }
}