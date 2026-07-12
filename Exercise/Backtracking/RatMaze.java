public class RatMaze {
    //print the path of rat in maze
    public static void printarr(int ans[][]){
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //check if the cell is safe or not
    public static boolean issafe(int maze[][],int row,int col,boolean visited[][]){
        int n=maze.length;
        if(row>=0 && row<n && col>=0 && col<n && maze[row][col]==1 && !visited[row][col]){
            return true;

        }
        return false;
    } 
    //function to solve the maze
    public static void  MazeSol(int maze[][],int row,int col,boolean visited[][],int ans[][]){
        int n=maze.length;
        visited[row][col]=true;
        ans[row][col]=1;

        //base case
        if(row==n-1 && col==n-1){
            printarr(ans);
            visited[row][col]=false;//backtracking
            ans[row][col]=0;
            return;
        }
        

        if (issafe(maze, row, col-1, visited)){
        MazeSol(maze, row, col-1,visited,ans);//left
        }
        if (issafe(maze, row-1, col, visited)){
        MazeSol(maze, row-1, col,visited,ans);//up
        }
        if (issafe(maze, row+1, col, visited)){
        MazeSol(maze,row+1,col,visited,ans);//right
        }
        if (issafe(maze, row, col+1, visited)){
        MazeSol(maze, row, col+1,visited,ans);//down
        } 

        visited[row][col]=false;
        ans[row][col]=0;
    }
    //main function
    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
        int n=maze.length;
        boolean visited[][]=new boolean[n][n];
        int ans[][]=new int[n][n];

        MazeSol(maze, 0, 0, visited, ans);
    }
}