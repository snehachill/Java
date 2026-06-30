public class Overriding {
    public static void main(String[] args) {
    Monkey muffy=new Monkey();
    muffy.eats();
    }
}
class Animal{
    void eats(){
        System.out.println("eats everything");
    }
}

class Monkey extends Animal{
    void eats(){
        System.out.println("eats banana");
    }
}
