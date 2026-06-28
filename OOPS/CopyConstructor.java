public class CopyConstructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Aryan";
        s1.rollno=23;
        s1.password="trialpassword";
        
        Student s2=new Student(s1);
        s1.name=s1.name;
        s1.rollno=s1.rollno;
        s2.password="password";

        System.out.println("The detail of student: " + s1.name + " " +  s1.rollno +" " +   s1.password );
        System.out.println("Deatils of other student: " + s2.name + " " + s2.rollno + " " + s2.password);

    }
    
}
class Student{
    String name;
    int rollno;
    String password;

    Student(Student s1){
        this.name=s1.name;
        this.rollno=s1.rollno;
    }

    Student(){
       System.out.println("welcome Students");
    }
    
}
