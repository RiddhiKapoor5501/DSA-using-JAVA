public class OOPS{
    public static void main(String args[]) {
        Pen p1 = new Pen(); //to make space in memory to store the prop for pen objet p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        // BankAccount = new BankAccount;
        // myAcc.username = "Riddhi";
        
    }


}

// class BankAccount {
//     public String username;
//     private String password;
//     public void setPassword(String pwd) {
//         password = pwd; 
//     }
// }

class Pen {
    private String color;// since access is cjhanged toprivate in the main function we change the.color to getColor()
    int tip;

    String getColor(){
        return this.color;
    }

    int getTip() {
        return this.tip; 

    }

    void setColor(String newColor){ // func1
        this.color = newColor;
    }

    void setTip(int newTip){ // func2
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;
    
    void calculatePerecentage(int phy, int chem, int math){
        percentage = ((phy + chem + math)*100)/300;
    }
}