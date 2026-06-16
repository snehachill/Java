public class CountingSort {
    public static void countingSort(int nums[]){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

        int count[]=new int[max+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }

        for(int i=1;i<=max;i++){
            count[i]+=count[i-1];
        }

        int output[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            output[count[nums[i]]-1]=nums[i];
            count[nums[i]]--;
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=output[i];
        }
    }
    public static void main(String[] args) {
        int nums[]={4,2,1,3,5};
        countingSort(nums);

        for(int num:nums){
            System.out.print(num + " ");
        }
    }
}