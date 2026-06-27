//basic program of class and object
public class Main{
   public static void main(String[] args) {
     Pen p1= new Pen();//created a pen object called p1
     p1.SetColor("Blue");
     System.out.println(p1.color);
     p1.SetTip(5);
     System.out.println(p1.tip);


 }
}
class Pen{
    String color;
    int tip;

    void SetColor(String newColor){
       color=newColor;
    }

    void SetTip(int newtip){
        tip=newtip;
    }
}