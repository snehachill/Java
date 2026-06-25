public class ClearRange {
    public static int ClearRangebit(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1; // FIXED: 'i << i' ko '1 << i' kiya
        int bitmask = a | b;
        return n & bitmask;
    }
    public static void main(String[] args) {
    // 31 ka binary hota hai: 00011111
    // 1 se 4 tak ki bits clear hone ke baad output 17 aana chahiye!
    System.out.println(ClearRangebit(31, 1, 4)); 
}
}
