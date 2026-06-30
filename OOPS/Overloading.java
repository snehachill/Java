public class Overloading {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.sum(1,4));
        System.out.println(calc.sum(3,9,10));
        System.out.println(calc.sum((float)3.5, (float)3.0));
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
