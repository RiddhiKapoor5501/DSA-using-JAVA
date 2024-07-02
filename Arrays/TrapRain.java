import java.util.*;
public class TrapRain {

    public static int TappedRainwater(int height[]){
        //calculate left max boundary-array
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i =1;i<height.length; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }


        //calculate right max boundary - array
        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];//indexing starts from 0
        for(int i = height.length-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);


        }
        int trappedWater = 0;
        //loop
        for(int i =0; i<height.length; i++){
            int WaterLevel = Math.min(leftmax[i], rightmax[i]);
            trappedWater += WaterLevel - height[i];
        }

        return trappedWater;


        //waterlevel = min(leftmax, rightmax)

        //trapped water = water level - height[i]
    }
    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TappedRainwater(height));

    }
}