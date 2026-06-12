public class ContainsDuplicate {
    public static boolean ContainsDuplicate(int nums[]) {
     for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
           if(nums[i]==nums[j]){
              return true;
           }
        }
     }
      return false;
}
public static void main(String[] args) {
    int nums[]={1,2,3,1};
    System.out.println(ContainsDuplicate(nums));
}
}

//Time Complexity: O(n^2) - We have two nested loops, each iterating through the array, resulting in a quadratic time complexity.
