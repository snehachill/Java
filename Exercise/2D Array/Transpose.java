public class Transpose {
    
    // 🎯 Transpose karne aur print karne ka proper Function
    public static void transposeMatrix(int matrix[][]) {
        int oldRow = matrix.length;       // 2
        int oldCol = matrix[0].length;    // 3

        int transposeMatrix[][] = new int[oldCol][oldRow]; // [3][2]

        for (int i = 0; i < oldRow; i++) {       
            for (int j = 0; j < oldCol; j++) {   
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

       
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < oldCol; i++) {       
            for (int j = 0; j < oldRow; j++) {   
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {11, 12, 13},
            {21, 22, 23}
        };

        System.out.println("Original Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("-----------------");
        transposeMatrix(matrix);
    }
}
