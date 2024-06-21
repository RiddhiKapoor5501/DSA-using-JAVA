import java.util.*;
public class product  {
  

  public static int multiply(int a,int b){
     
    

    int products = a * b;
    return products;
  }
  public static void main(String args[]) {
    int  a=15;
    int  b=15;
    int prod = multiply(a,b);//call by value 
    System.out.println("a * b = " + prod);

     
  }
  
}