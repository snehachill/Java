public class average {
   public static int average(int a, int b,int c) {
      return (a + b + c) / 3;
   }
   public static void main(String[] args) {
      int n1=3;
      int n2=5;
      int n3=90;
      int result = average(n1, n2, n3);
      System.out.println("The average is: " + result);
   }

}