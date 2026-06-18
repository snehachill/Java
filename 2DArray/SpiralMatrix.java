public class SpiralMatrix {

    public static void printSpiral(int num[][]){
        int startRow=0;
        int EndRow=num.length-1;
        int startCol=0;
        int EndCol=num[0].length-1;

        while(startRow<=EndRow  && startCol<=EndCol){
            //top
            for(int j=startCol; j<=EndCol; j++){
                System.out.println(num[startRow][j]+" ");
            }
            //right
            for(int i=startRow + 1;i<=EndRow;i++){
                System.out.println(num[i][EndCol]);
            }
            //bottom
            for(int j=EndCol-1;j>=startCol;j--){
                System.out.println(num[EndRow][j]);
            }
            //left
            for(int i=EndRow-1;i>=startRow + 1;i--){
                System.out.println(num[startCol][i]);
                
            break;
            }
        startCol++;
        startRow++;
        EndCol--;
        EndRow--;
        }
      System.out.println();
}


    public static void main(String[] args) {
        int num[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
       printSpiral(num);
    }
}