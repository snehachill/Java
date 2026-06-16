import java.util.Scanner;
public class basicArray {
    public static void main(String[] args) {
        int[] Marks= new int[5];
        
        Scanner sc= new Scanner(System.in);
        Marks[0]= sc.nextInt();
        Marks[1]= sc.nextInt();
        Marks[2]= sc.nextInt();

        System.out.println("Marks of student 1: "+ Marks[0]);
        System.out.println("Marks of student 2: "+ Marks[1]);   
        System.out.println("Marks of student 3: "+ Marks[2]);

        int percentage= (Marks[0]+Marks[1]+Marks[2])/3;
        System.out.println("Percentage of students: "+ percentage+"%");
                
        sc.close();


}
}