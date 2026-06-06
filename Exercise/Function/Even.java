public class Even {
    public static boolean IsEven(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        int num = 10;
        if (IsEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is not even.");
        }
    }
}
