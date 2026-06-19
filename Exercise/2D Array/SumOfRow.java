public class SumOfRow {
    public static int SumofROw(int matrix[][]){
        int row=1;
        int col=0;
        int sum=0;
        while(col<matrix[0].length){
            sum+=matrix[row][col];
            col++;
        }
    System.out.println("the sum is :"+sum);
    return sum;
    }

    public static void main(String[] args) {
        int matrix[][]={{1,4,9},
                        {11,4,3},
                        {2,2,3} };
        SumofROw(matrix);
    }
}
