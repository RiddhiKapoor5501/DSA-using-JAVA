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


//Hierarhichal Inheritance
class Animal {
    String color;//properties
    void eat(){ //unn properties ke function
        System.out.println("eats");

    }

    void breathe() {
        System.out.println("breathes");
    }

    

}

class Mammal extends Animal {
    void walks(){
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim(){
        System.out.println("swims");
    }
}

class Fish extends Animal {
    void fly(){
        System.out.println("flys");
    }
}