public class AbstractClass {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.eat();
        horse.walks();
        horse.colorchange();
        System.out.println("Horse color is: "+horse.color);

    }
    
}
abstract class Animal{
    String color;
    Animal(){
        this.color="brown";
    }
    void eat(){
        System.out.println("eats everything");
    }
    abstract void walks();
}

class Horse extends Animal{
    void colorchange(){
        color="black";
    }
    void walks(){
        System.out.println("walks on 4 legs");
    }
}

class Human extends Animal{
    void colorchange(){
       color="white";
    }
    void walks(){
        System.out.println("walks on 2 legs");
    }
}
