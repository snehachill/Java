public class Sudoku {
    //function to check if it is safe to place digit in the cell
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        //for row--row fixed
        for(int j=0;j<9;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }

        //for col--col fixed
        for(int i=0;i<9;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }

        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                 if(sudoku[i][j]==digit){
                    return false;
                 }
            }
        }
        return true;

    }
    public static boolean Sudokusolver(int sudoku[][],int row,int col){
        //base class
        if(row==9){
            return true;
        }
        //next cell coordinates
        int NextRow=row;int Nextcol=col+1;
        if(col+1==9){
            NextRow=NextRow+1;
            Nextcol=0;
        }
        //if elements are already placed move ahead
        if(sudoku[row][col]!=0){
            return Sudokusolver(sudoku, NextRow, Nextcol);
        }
        //placing digits
        for(int digit=1;digit<=9;digit++){

            if(isSafe(sudoku, row, col, digit)){//if safe to place
                  sudoku[row][col]=digit;//choice
                  if(Sudokusolver(sudoku, NextRow, Nextcol)){//next step
                    return true;
                  }
                  sudoku[row][col]=0;//backtracking
            }
        }
        return false;

    }
    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][]={{5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(Sudokusolver(sudoku, 0, 0)){
            printSudoku(sudoku);
        }else{
            System.out.println("No solution exists");
        }
    }
}
