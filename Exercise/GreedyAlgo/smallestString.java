public class smallestString {
    public static String getSmallestString(int n, int k) {
        char[] result = new char[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i]='a';
        }
        int remainingValue = k - n;
        for (int i = n - 1; i >= 0 && remainingValue >0 ;i--){
            int add= Math.min(25, remainingValue);
            result[i] = (char)('a'+add);
            remainingValue-=add;
        }
        return new String(result);
    }
    public static void main(String[] args) {
        int n=5;
        int k=42;
        String arr=getSmallestString(n, k);
        System.out.print(arr);
    }
}
