public class GridWays{
    public static int gridways(int i,int j,int n,int m){
     //base class
     if(i==n-1 || j==m-1){
         return 1;
     } 
     if(i==n || j==m){
        return 0;
     } 
    int w1=gridways(i+1, j, n, m);//down
    int w2=gridways(i, j+1, n, m);//right

    int totalways=w1+w2;
    return totalways;
}
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(gridways(0, 0 ,n, m));
    }
}