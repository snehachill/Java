/*import java.util.*;
public class WhileLoop {
    public static void main(String args[]) {
        int counter=0;
        while(counter<10){
            System.out.println("Hello world");
            counter++;
        }
    }
}*/

/*public class WhileLoop {
    public static void main(String args[]) {
        int counter=0;
        while(counter<10){
            System.out.println(counter);
            counter++;
        }
    }
}*/

/*import java.util.*;
public class WhileLoop {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int counter=0;
        while(counter<n){
            System.out.println(counter);
            counter++;
        }
    }
}*/

 //-----------------------------SUM OF FIRST N NATURAL NUMBERS----------------------
/*import java.util.*;
public class WhileLoop {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0;

        int i=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("The sum is "+sum);
    }
}*/

//---------------------------REVERSING A NUMBER----------------------
/*public class WhileLoop{
    public static void main (String args[]){
       int n=9887;
       while(n>0){
        int Lastdigit=n%10;
        System.out.print(Lastdigit);
        n=n/10;
       }
        }
    }*/

//---------------------------REVERSE A orginial NUMBER ----------------------
public class WhileLoop{
    public static void main (String args[]){
       int n=9887;
       int reverse=0;
       
       while(n>0){
          int Lastdigit=n%10;
          reverse=reverse*10+Lastdigit;
            n=n/10;
         }
            System.out.println(reverse);
       }
    }



         