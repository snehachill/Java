public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog tuffy=new Dog();
        tuffy.bark();
        tuffy.eat();
        
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void wild(){
         System.out.println("wild");
    }
}

class Mammals extends Animal{
    void legs(){
       System.out.println("has legs");
    }
}

class Dog extends Mammals{
    void bark(){
        System.out.println("barks");
    }
}