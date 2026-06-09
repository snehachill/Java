//prefixsum
public class MaxsumArray {
    public static void MaxSumArray(int num[]){
        int MaxSum=Integer.MIN_VALUE;
        int prefix[]=new int [num.length];

        prefix[0]=num[0];
         for(int i=1;i<num.length;i++){
            prefix[i]=prefix[i-1]+num[i];
         }
        
         for(int i=0; i<num.length;i++){
            for(int j=i;j<num.length;j++){

              int currSum=(i==0) ? prefix[j]  : prefix[j]-prefix[i-1];
              if(currSum>MaxSum){
                MaxSum=currSum;
            }
          }
        }
         System.out.println("the max sum is : "+ MaxSum);
        }
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        MaxSumArray(num);
    }
}
