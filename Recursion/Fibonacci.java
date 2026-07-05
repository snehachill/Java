public class Fibonacci {
    //recursive part
    public static int fibSeries(int n) {
        if(n==0 || n==1){
            return n;
        }
        int fb1=fibSeries(n-1);
        int fb2=fibSeries(n-2);
        int fb=fb1+fb2;
        return fb;
    }
    public static void main(String[] args) {
        System.out.print(fibSeries(10));
    }
}
