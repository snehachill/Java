public class Largest {
    public static int getLargest(int Numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<Numbers.length;i++){
            if(largest<Numbers[i]){
                largest=Numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int Numbers[]={1,2,3,4,5,6,7,9,8};
        System.out.println("Largest number is: "+getLargest(Numbers));
    }
}
