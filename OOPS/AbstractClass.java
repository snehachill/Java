public class AbstractClass {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.eat();
        horse.walks();

    }
    
}
abstract class Animal{
    void eat(){
        System.out.println("eats everything");
    }
    abstract void walks();
}

class Horse extends Animal{
    void walks(){
        System.out.println("walks on 4 legs");
    }
}

class Human extends Animal{
    void walks(){
        System.out.println("walks on 2 legs");
    }
}
