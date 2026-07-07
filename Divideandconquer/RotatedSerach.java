public class RotatedSerach {
    public static int Search(int arr[],int tar,int si,int ei){
        //base class
        if(si>ei){
            return -1;
        }
        
        int mid=si+(ei-si)/2;

         if(arr[mid]==tar){
             return mid;
         }

         //mid on l1
        if(si<=mid){
            //case a:search on left
             if(arr[si]<=tar && tar<=arr[mid]){
                return Search(arr, tar, si, mid-1);//recursive function}
             }
             //case b:search on right
             else{
                 return Search(arr, tar, mid+1, ei);
             }            
        }

        //on l2
        else{
            //case c:right
            if(arr[mid]<=tar && tar<=arr[ei]){
                return Search(arr, tar, mid+1, ei);
            }
            else{
                return Search(arr, tar, si, mid-1);
            }
        }
    }
    //main function
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        int target=0;
        int tdix=Search(arr, target, 0, arr.length-1);
        System.out.println(tdix);
    }
}
