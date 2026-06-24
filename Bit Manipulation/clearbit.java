public class clearbit {
    public static int clearithbit(int n,int i) {
        int mask= ~(1<<i);
        return (n & mask);
    }
    public static void main(String[] args) {
        System.out.println(clearithbit(10, 2));
    }
}
