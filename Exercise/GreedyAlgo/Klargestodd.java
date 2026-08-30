public class Klargestodd{
    public static int largestOdd(int R,int L,int k) {
       int lastodd;
       if(R%2!=0){
           lastodd=R;
       }
       else{
           lastodd=R-1;
       }
       int kthodd=lastodd-(k-1)*2;  
       if(kthodd<L){
         return 0;
       }
       return kthodd;
    }
    public static void main(String[] args) {
        int R = 3;
        int L = -3;
        int k = 1;
        System.out.println("The " + k + "th largest odd number between " + L + " and " + R + " is: " + largestOdd(R, L, k));
    }
}