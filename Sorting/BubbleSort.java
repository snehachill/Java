public class BubbleSort{
    public static void BubbleSort(int nums[]){
        for(int i=0;i<nums.length;i++){//outer loop(round or passes)

            boolean swapped=false;
             for(int j=0;j<nums.length-1-i;j++){//to check with adjacent element
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                    swapped=true;
                }
        }
        if(swapped==false){
            break;
        }
    }
}
 public static void main(String[] args) {
    int nums[]={4,3,1,2,6};
    BubbleSort(nums);
    System.out.println("Sorted Array:");
        for(int num : nums) {
            System.out.print(num + " ");
        }
 }
}