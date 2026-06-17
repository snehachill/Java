import java.util.Scanner;

public class Basic {
    public static void main(String args[]) {
        int num[][]=new int[3][3];
        int n=num.length;
        int m=num[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the 2D array:");
        //input for 2D array
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                   num[i][j] = sc.nextInt();
            }
        }
        //output for 2D array
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(num[i][j]+" ");
            } 
            System.out.println(); 
        }
        sc.close();
    }
}
