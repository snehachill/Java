/*import java.util.*;
public class DoWhile {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
      do{
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n%10==0){
            break;
        }
        System.out.println("You entered: " + n);
        }
        while(true);
      }
    }*/


import java.util.*;
public class DoWhile {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        
      do{
        System.out.println("Enter a number");
        int n=s.nextInt();
        if(n%10==0){
            continue;
        }
        System.out.println("You entered: " + n);
        }
        while(true);
      }
    }