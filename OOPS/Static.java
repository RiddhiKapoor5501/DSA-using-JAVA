public class Static {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "JMV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);//school name for student 2 is also jmv as school name is static


    }
    
}

class Student {
    String name ;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;

    }

    String getName() {
        return this.name;
    }
}
