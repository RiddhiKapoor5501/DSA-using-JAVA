public class Abstract {
    public static void main(String args[]) {
        Horse h = new Horse ();
        h.eat();
        h.walk();
        System.out.println(h.color);
        //objects of abstract classes like Animal cannot be called in main

    }
}

abstract class Animal{
    String color;

    Animal () {
        color = "brown";//this constructor is by default keeps all the animal in its derived classes
        //of brown color until the changeColor function is called               


    }
    void eat () {
        System.out.println("animal eats");
    }

    abstract void walk();//abstract class as their is no implementation
}

class Horse extends Animal {

    void changeColor(){
        color = "dark brown";
    }



    void walk() {
        System.out.println("walks on 4 legs");//since walk is already defined in the class animal we need to implement it in horse
    }

}