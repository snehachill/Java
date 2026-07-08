public class Permutation {
    public static void FindPermutation(String str,String ans) {
        //base class
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //main work
        for(int i=0;i<str.length();i++){
            char Currchar=str.charAt(i);
            //to delet the currchar
            String remString=str.substring(0,i)+str.substring(i+1);
            FindPermutation(remString, ans+Currchar);
        }
        
        }   
    public static void main(String[] args) {
        String str="abc";
        FindPermutation(str, "");

    }
}
