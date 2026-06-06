package loop;

/*Write a program that reads a set of integers,and then prints the sum of the even and odd integers*/

import java.util.Scanner;
public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        int number;
        System.out.println("Enter integers (enter 0 to stop):");
        while(true){
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if(number % 2==0){
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);
    }
}