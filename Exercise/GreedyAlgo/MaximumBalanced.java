public class MaximumBalanced {
    public static int maxBalancedLength(String s) {
       int balance=0;
       int count=0;
       for(int i=0;i<s.length();i++){
          char c = s.charAt(i);
          if (c == 'L') {
              balance++;
          } else if (c == 'R') {
              balance--;
          }
          if (balance == 0) {
              count++;
          }
       }
       return count;
    }

    public static void main(String[] args) {
        String s = "LRRRRLLRLLRL";
        System.out.println("Maximum balanced length: " + maxBalancedLength(s));
    }
}