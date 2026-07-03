public class OptimizedPower {
    public static int optimized(int x,int n) {
        if(n==0){
            return 1;
        }
        int half=optimized(x, n/2);
        int halfsq=half*half;

        //odd case
        if(n%2 !=0){
            return x*halfsq;
        }
        return halfsq;
    }
    public static void main(String[] args) {
        System.out.println(optimized(2, 10));

    }
}
