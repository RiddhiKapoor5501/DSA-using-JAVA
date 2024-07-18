import java.util.*;
public class shortestpath {

    public static float ShortestPath(String path) {
        int x = 0;
        int y = 0;

        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);
            //south
            if(dir == 'S'){
                y--;
            }
            //north
            else if(dir == 'N'){
                y++;
                
            }
            //west
            else if(dir == 'W'){
                x--;
            }
            //east
            else{
                x++;
            }

        }

        int X2 = x*x;
        int Y2 = y*y;
        
        return (float)Math.sqrt(X2 + Y2);
    }


    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println(ShortestPath(path));


    }
}