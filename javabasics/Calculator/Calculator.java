
import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        System.out.println("Enter the operator (+, -, *, /):");
        char operator=sc.next().charAt(0);  
        switch(operator){
            case '+':
                System.out.println("The sum is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("The difference is: " + (num1 - num2));
                break;
            case '*':
                System.out.println("The product is: " + (num1 * num2));
                break;
            case '/':
               System.out.println("The quotient is: " + (num1 / num2));
                break;
            default:
                System.out.println("My calculator is not advanced!");
        }

    }
    
}
