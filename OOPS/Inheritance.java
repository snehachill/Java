public class Inheritance {
    public static void main(String[] args) {
        Fish Shark=new Fish();
        Shark.eat();
        Shark.swins();
    }
}
//Parent or base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void wild(){
         System.out.println("wild");
    }
}
//child or derived class
class Fish extends Animal{
    String name;
    void swins(){
        System.out.println("swins");
    }
    void fins(){
        System.out.println("fins ");
    }
}