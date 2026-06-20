public class method {
     public static void Printletters(String str){
        for(int i=0;i<str.length();i++){
           System.out.print(str.charAt(i) +"");
        }
        System.out.println();
     }

    public static void main(String[] args) {
        String name="Sneha";
        String lastname="Tiwari";
        String fullname= name + " " + lastname;
        Printletters(fullname);
        
    }
}
