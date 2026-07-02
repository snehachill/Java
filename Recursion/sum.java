public class sum {
    public static int  firstNsum(int n){
        if(n==1){
            return 1;
       }
       int sumN=n+firstNsum(n-1);;
       return sumN;
    }
    public static void main(String[] args) {
        System.out.println(firstNsum(5));
    }
}
