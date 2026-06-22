import java.util.Arrays;

public class anagramcheck{
    public static boolean isAnagram(String str1, String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){
            char[] char1=str1.toCharArray();
            char[] char2=str2.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);
            
            if(Arrays.equals(char1, char2)){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="race";
        String str2="care";

        if(isAnagram(str1,str2)){
            System.out.println("BOTH STRINGS ARE ANAGRAM");
        }
        else{
            System.out.println("NOT A ANAGRAM"); 
        }
        isAnagram(str1, str2);
    }
}