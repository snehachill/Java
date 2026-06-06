                              /*basic java program
public class basics{
    public static void main(String[] args){
        System.out.print("Hello World");
        System.out.print("Welcome to Java Programming");
        System.out.print("This is a basic Java program");
    }

}
*/


/*                                      user input
import java.util.*;
public class basics{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        //String input=s.nextLine();
        //System.out.println("You entered: " + input);

        int input=s.nextInt();
        System.out.println("You entered: " + input);
    }
}
*/

                                   /* Sum of two numbers
import java.util.*;
 public class basis{
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int sum=a+b;
        System.out.println("The sum of a and b is: " + sum);
        
    }
 }
    */

                                  /* Product of two numbers
import java.util.*;
 public class basis{
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int Product=a*b;
        System.out.println("The product of a and b is: " + Product);
        
    }
 }
    */  

                                         // Area of a circle
/*import java.util.*;
    public class basis{
        public static void main (String args[]){
            Scanner s=new Scanner(System.in);
            double radius=s.nextDouble();
            double area=3.14*radius*radius;
            System.out.println("The area of the circle is: " + area);
            
        }
    }
    */

                                         //type conversion
/*import java.util.*;
public class basis{
    public static void main(String args[]){
        Scanner s =new Scanner (System.in);
        int a=s.nextInt();
        float b=a; // implicit type conversion
        System.out.println("The value of b is: " + b);
    }
}
 */


                                             /* Type Casting
import java.util.*;
public class basis{
    public static void main(String args[]){
        Scanner s =new Scanner (System.in);
        float a=s.nextFloat();
        int b=(int)a; // explicit type conversion
        System.out.println("The value of b is: " + b);
    }
}

*/   

                             //Type casting without user input   
/*;
public class basis{
    public static void main(String args[]){
        float marks=99.99f;
        int marks2=(int)marks;
        System.out.println("The value of marks2 is: " + marks2);
    }
}
*/

                                    //Type promotion
/*import java.util.*;
public class basis{
    public static void main(String args[]){
       char a='A';
       char b='B';
       System.out.println((int)a);
       System.out.println((int)b);
         int sum=a+b; // char is promoted to int 
        System.out.println("The sum of a and b is: " + sum);
    }
}
*/


                               //EXERCISE 
/*import java.util.*;
public class basis{
    public static void main(String args[]){
        Scanner s =new Scanner (System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int average=(a+b+c)/3;
        System.out.println("The average of a, b and c is: " + average);
    }
}

public class basis{
    public static void main(String args[]){
        float side=24.70f;
        float area=side*side;
        System.out.println("The area of the square is: " + area);
    }
}*/

         //TYPES OF OPERATORS
/*public class basis{
    public static void main(String args[]){
        int A=50;
        int B=20;
        System.out.println("The value of A+B is: " + (A+B)); // arithmetic operator
        System.out.println("The value of A-B is: " + (A-B)); //
        System.out.println("The value of A*B is: " + (A*B)); // arithmetic operator
        System.out.println("The value of A/B is: " +(A/B));
        System.out.println("The value of A%B is: " +(A%B));

    }
}*/

                                //Urnary operator
 /*public class basis{
    public static void main(String args[]){
        int A=50;
        int B=A++;
        System.out.println("The value of A is: " + A); // 51
        System.out.println("The value of B is: " + B); // 51
    }
 }*/
              
                            //Relational operator
/*public class basis{
    public static void main(String args[]){
        int A=10;
        int B=20;
        System.out.println("The value of A==B is: " + (A==B));
            System.out.println("The value of A!=B is: " + (A!=B));
            System.out.println("The value of A>B is: " + (A>B));
            System.out.println("The value of A<B is: " + (A<B));

    }
}*/

                      //logical operator
/*public class basis{
    public static void main(String args[]){
        System.out.println((3>2) && (5>0));
        System.out.println((3>9) || (5>9));
        System.out.println(!(3>8));


    }
}*/

                //Assignment operator
/*public class basis{
    public static void main(String args[]){
        int A,B;
        A=B=10;
        A+=B;
        A*=5;
        System.out.println("The value of A is: " + A);
    }
}*/

/*public class Test{
    public static void main(String[] args){
    int x = 2, y = 5;
    int exp1 = (x * y / x);
    int exp2 = (x * (y / x));
    System.out.println(exp1);
    System.out.println(exp2);
   }   
}*/

/*public class Test {
    public static void main(String[] args)
    {int x, y, z;
    x = y = z = 2;
    x += y;y -= z;
    z /= (x + y);
    System.out.println(x + " " + y + " " + z);
}
}*/
   //---------------------------CONDITIONAL STATEMENTS----------------------------//
/*public class Test {
    public static void main(String[] args){
        int age=22;
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
}*/

/*public class Test {
    public static void main(String[] args){
        int a=10;
        int b=5;
        if(a>b){
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("b is greater than a");
        }
    }
}*/


/*import java.util.*;
public class Test {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%2==0){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It is an odd number");
        }
    }
}*/

//else-if statement
/*import java.util.*;   
public class Test {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else if(age>=16 && age<18){
            System.out.println("You are eligible to drive");
        }
        else{
            System.out.println("You are not eligible to vote or drive");
        }
    }
}*/

/*import java.util.*;
public class Test {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int income=s.nextInt();
        if(income<=500000){
            System.out.println("You are in the 5% tax bracket");
        }
        else if(income>500000 && income<=1000000){
            System.out.println("You are in the 20% tax bracket");
        }
        else{
            System.out.println("You are in the 30% tax bracket");
        }
    }
}*/
/*
 public class Test {
    public static void main(String[] args){
        int a=50;
        int b=40;
        int c=10;
        if(a>b && a>c){
            System.out.println("A is the greatest number");
        }
        else if (b>a && b>c){
            System.out.println("B is the greatest number");
        }
        else{
            System.out.println("C is the greatest number");
        }
        }
}
*/
//Ternary operator
/* 
public class Test {
    public static void main(String[] args){
        int n=10;
        //ternary operator
        String result = (n%2==0) ? "even" : "odd";
        System.out.println(result);
    }
}*/

/*public class Test {
    public static void main(String[] args){
        int marks=20;
        String result=(marks>=33) ? "pass" : "fail";
        System.out.println(result);
    }
}*/

public class Test{
    public static void main(String[] args){
    int num=2;
    switch(num){
        case 1:
            System.out.println("Burger");
        case 2:
            System.out.println("Pizza");
            break;
        case 3:
            System.out.println("Pasta");
            break;
         default:
            System.out.println("Invalid choices");
    }
    }
}








