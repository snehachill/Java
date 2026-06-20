public class SubString {
    public static String Substring(String str,int si,int ei){
       String subStr="";
       for(int i=si;i<ei;i++){
         subStr+=str.charAt(i);
       }
       return subStr;
    }
    public static void main(String[] args) {
        String str="Hello World";
        System.out.print(Substring(str,0,9));
    }
}
