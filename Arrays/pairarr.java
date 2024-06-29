import java.util.*;
public class pairarr {

    public static void Pairs(int numbers[]){
        int tot_pairs = 0;
        for(int i=0; i<numbers.length; i++){
            int current = numbers[i]; // 2, 4, 6, 8, 10
            for(int j = i+1; j<numbers.length; j++){//pairing 2 with 4 6 8 10
                System.out.print("(" + current +"," + numbers[j] + ")");
                tot_pairs++;

            }
            System.out.println();
        }
        System.out.println(tot_pairs);

    }
   public static void main(String args[]) {
    int numbers[] = {2, 4, 6, 8, 10};
    Pairs(numbers);


    }
}