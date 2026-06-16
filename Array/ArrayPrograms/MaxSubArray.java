public class MaxSubArray{
    public static void MaxArraySum(int num[]){
        int MaxSum=Integer.MIN_VALUE;

        for(int i=0; i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                int currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=num[k];
                }
                if(currsum>MaxSum){
                    MaxSum=currsum;
                }
            }
        }
           System.out.println("The Max sum: " + MaxSum);
}
public static void main(String args[]){
     int num[]={1,2,3,4};
     MaxArraySum(num);
}
}

