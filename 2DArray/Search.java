import java.util.*;
public class Search{
public static boolean Search(int num[][],int key){
      for(int i=0;i<num.length;i++){
        for(int j=0;j<num[0].length;j++){
            if(num[i][j]==key){
                System.out.println("key found at index  (" +i+","+j+")");
                return true;
            }
        }
      }
      return false;
}
public static void main(String[] args) {
    int num[][]=new int[3][3];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the elements of the 2D array: ");
    for(int i=0;i<num.length;i++){
        for(int j=0;j<num[0].length;j++){
        num[i][j]=sc.nextInt();
     }
    }
    System.out.println("Enter the key you want to search: ");
    int key=sc.nextInt();

    System.out.println("The position of key: ");
    Search(num,key);
}
}
   

    