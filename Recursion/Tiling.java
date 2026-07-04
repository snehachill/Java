public class Tiling {
    public static int way(int n){
       if (n==0 || n==1){
        return 1;
       }
       int totalway=way(n-1)+way(n-2);
       return totalway;
    }
    public static void main(String[] args) {
        System.out.println(way(3));
    }
}
