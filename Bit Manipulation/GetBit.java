public class GetBit {
    public static int Getithbit(int n,int i){
       int mask=1<<i;
       if((n & mask) ==0){
         return 0;
       }
       else{
           return 1;
       }
    }
    public static void main(String[] args) {
        int n=10;
        int i=2;
        System.out.println(Getithbit(n, i));
    }
}
