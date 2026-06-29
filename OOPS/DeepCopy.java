import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Aryan";
        s1.rollno = 11;
        s1.marks[0] = 99;
        s1.marks[1] = 22;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.name = "aish";
        s2.marks[1] = 100; 

        // Using Arrays.toString() to see the array elements
        System.out.println("Details s1: " + s1.name + " | Roll: " + s1.rollno + " | Marks: " + Arrays.toString(s1.marks));
        System.out.println("Details s2: " + s2.name + " | Roll: " + s2.rollno + " | Marks: " + Arrays.toString(s2.marks));
    }
}

class Student {
    String name;
    int rollno;
    int marks[];

    // Default Constructor
    Student() {
        System.out.println("welcome Students");
        this.marks = new int[3]; // Fixed: Initialize the array size here!
    }

    // Deep Copy Constructor
    Student(Student s1) {
        this.name = s1.name;
        this.rollno = s1.rollno;

        // Allocating new memory space for the copy
        this.marks = new int[s1.marks.length];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}