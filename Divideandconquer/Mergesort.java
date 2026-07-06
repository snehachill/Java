public class Mergesort {
    //to print arr
    public static void printarr(int arr[]) {
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+ " ");
    }
    System.out.println();
   }

   //recursive part
    public static void mergeSort(int arr[],int si,int ei){
         //base class
       if(si>=ei){
            return;
       }
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);//left part
        mergeSort(arr, mid+1, ei);//right part
        merge(arr, si, mid,ei);
    }
    
    //to sort
    public static void merge(int arr[],int si,int mid,int ei) {
       int temp[]=new int[ei-si+1];
       int i=si;//iterator for left part
       int j=mid+1;//iterator for right part
       int k=0;//iterator for temp
 
       while(i<=mid && j<=ei){
       if(arr[i]<arr[j]){
         temp[k]=arr[i];
         i++;
       }
       else{
          temp[k]=arr[j];
          j++;
        }
        k++;
      }
      //for the remaining element of left part
      while(i<=mid){
        temp[k++]=arr[i++];
      }
      //for the remaining element of right part
      while(j<=ei){
        temp[k++]=arr[j++];
      }

      //copying temp array to original array
      for(k=0,i=si;k<temp.length;k++,i++){
         arr[i]=temp[k];
      }
   }
   
   public static void main(String[] args) {
    int arr[]={3,6,9,2,4,8};
    mergeSort(arr, 0, arr.length-1);
    printarr(arr);
   }
}

