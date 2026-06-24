public class SetBit {
    public static int SetithBit(int n, int i){
        int Mask=1<<i;

        return n | Mask;
    }
    public static void main(String[] args) {
        int n=10;
        int i=2;
        System.out.println(SetithBit(n, i));
    }
    }