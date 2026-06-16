public class Kadanes {
    public static void kadanes(int num[]){
        int MaxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=1;i<num.length;i++){
            currSum=currSum+num[i];
           if(currSum>MaxSum){
              MaxSum=currSum;
           }
           if (currSum<0)  {
               currSum=0;
           }    
         }
         System.out.println("Maxsum : "+MaxSum);
        }
    public static void main(String[] args) {
        int num[]={-2, 3, 4, -1};
        kadanes(num);
    }
}
