public class Friendspairing {
   public static int pairways(int n) {
      if(n==1 || n==2){
        return n;
      }
      //two ways
      int Single=pairways(n-1);

      int twofr=(n-1)*pairways(n-2);

      int totalways=Single+twofr;
      return totalways;
   }
   public static void main(String[] args) {
    System.out.println(pairways(3));
   }
}
