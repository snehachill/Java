public class QuickSort {
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }    
    }
    public static void quicksort(int arr[],int si,int ei){
        //base class
        if(si>ei){
            return;
        }
        //last element
        int pIdx=partition(arr, si, ei);
        quicksort(arr, si, pIdx-1);//for left part
        quicksort(arr, pIdx+1, ei);//for right part
    }
    public static int partition(int arr[],int si,int ei) {
        //pivot
        int pivot=arr[ei];
        int i=si-1; //to make place for elements smaller than pivot

        for(int j=si;j<=ei;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quicksort(arr, 0, arr.length-1);
        printarr(arr);
    }
}
