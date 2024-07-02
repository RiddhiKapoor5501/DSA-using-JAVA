import java.util.*;
public class irhpn {

    public static void invertednums(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        invertednums(5);


    }
}