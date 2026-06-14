public class SelectionSort {
    public static void selectionSort(int nums[]){
       int n=nums.length;
       
       for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[minPos]){
                    minPos=j;
                }     
            }
            int temp=nums[minPos];
            nums[minPos]=nums[i];
            nums[i]=temp;
     }
}
public static void main(String[] args) {
    int nums[]={4,1,3,5};
    selectionSort(nums);

    for(int num : nums) {
            System.out.print(num + " ");
    }
  }
}
