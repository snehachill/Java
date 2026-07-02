public class printIncreasing {
    public static void printInc(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printInc(n+1);
    }
    public static void main(String[] args) {
        printInc(1);
    }
}
