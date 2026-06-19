public class PrintNo{

    public static int countNo(int matrix[][],int key){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println("the count is :"+count);
        return count;
    }

    public static void main(String[] args) {
        int matrix[][]={{7,8,8},
                        {8,8,7}};

        int key=8;
        countNo(matrix, key);
    }
}