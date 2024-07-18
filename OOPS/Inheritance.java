public class Inheritance{
    public static void main (String args[]){
        // Fish shark = new Fish();
        // shark.eat();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);

    }
}

//Single Level Inheritance
//base class
// class Animal {
//     String color;//properties
//     void eat(){ //unn properties ke function
//         System.out.println("eats");

//     }

//     void breathe() {
//         System.out.println("breathes");
//     }
// }

// //Derived Class
// class Fish extends Animal{
//     int fins;

//     void swim() {
//         System.out.println("swim in water");
//     }

     
// }

// Multi Level Inheritance
class Animal {
    String color;//properties
    void eat(){ //unn properties ke function
        System.out.println("eats");

    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String Breed;
}