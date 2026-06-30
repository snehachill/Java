public class Hierarchyinheritance {
    public static void main(String[] args) {
        Birds parrotBirds=new Birds();
        parrotBirds.fly();
        parrotBirds.eat();
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
    void walk(){
        System.out.println("walks");
    }
}

class Birds extends Animal{
    void fly(){
        System.out.println("flys");
    }
}

class fish extends Animal{
    void swin(){
        System.out.println("swins");
    }
}
