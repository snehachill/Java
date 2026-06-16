public class InsertionSort {
    public static void InsertionSort(int nums[]){
        int n=nums.length;
        
        for(int i =1;i<n;i++){
            int curr=nums[i];
            int prev=i-1;

            while(prev>=0  && nums[prev]>curr){
                nums[prev+1]=nums[prev];
                prev--;
            }
            //insertion
            nums[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int nums[]={3,4,1,2};
        InsertionSort(nums);

        for(int num:nums){
            System.out.print(num + "");
        }
    }
}
