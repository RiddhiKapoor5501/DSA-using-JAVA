import java.util.*;
public class creation {
    public static void printLetters(String str) {
        for (int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        //defination
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        // Strings are immutable

        //input of strings

        Scanner sc = new Scanner (System.in);
        String name;
        //name = sc.next();//inputs one word
        name = sc.nextLine();//inputs whole line

        System.out.println(name);//output of strings

        //concatenation

        String firstName = "Riddhi";
        String lastName = "Kapoor";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        printLetters(fullName);
    }
}