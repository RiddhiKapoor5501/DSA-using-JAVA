import java.util.*;
public class bubblesort {

    public static void BubbleSort(int arr[]){
        int n = arr.length;
        for(int turns=0; turns < n-1; turns++){
            for(int j = 0; j<n-1-turns; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                

            }
        }
    }

    public static void Printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    


    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        BubbleSort(arr);
        Printarr(arr);


    }
}