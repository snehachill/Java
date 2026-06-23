public class OddOrEven {
    public static void Oddeven(int n){
        int maskbit=1;
        if((n & maskbit)==0){
            System.out.println("even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        Oddeven(3);
        Oddeven(4);
        Oddeven(11);

    }
}
