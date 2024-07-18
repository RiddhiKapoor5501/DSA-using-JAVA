public class Const{

    public static void main(String args[]) {

        Student s1 = new Student();
        //System.out.println(s1.name) 
        Student s2 = new Student("Riddhi");
        Student s3 = new Student(123);                                                   


    }
}

class Student {
    String name;
    int roll;

    Student() {
        
        System.out.println("constructor is called");//non parameterized constructor
    }

    Student(String name) { //parameterized constructor
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }



        
    




}    
