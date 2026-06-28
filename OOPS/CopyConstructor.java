import java.util.Arrays;

public class CopyConstructor {
    public static void main(String[] args) {
        //shallow copy
        Student s1=new Student();
        s1.name="Aryan";
        s1.rollno=23;
        s1.marks[0]=90;
        s1.marks[1]=80;
        s1.marks[2]=100;
        
        Student s2=new Student(s1);
        s2.name="Aishwarya";
        s1.rollno=s1.rollno;
        s2.marks[0]=100;
        s2.marks[1]=50;
        s2.marks[2]=80;

        System.out.println("The detail of student: " + s1.name + " " +  s1.rollno +" " + Arrays.toString(s1.marks ));
        System.out.println("Details of other student: " + s2.name + " " + s2.rollno + " " + Arrays.toString(s2.marks) );

    }
    
}
class Student{
    String name;
    int rollno;
    int marks[]=new int[3];

    Student(Student s1){
        this.name=s1.name;
        this.rollno=s1.rollno;
        this.marks=s1.marks;
    }

    Student(){
       System.out.println("welcome Students");
    }
    
}
