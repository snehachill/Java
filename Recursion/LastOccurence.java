public class LastOccurence {
    public static int  Lastocc(int arr[],int target,int i) {
        if(i==-1){
            return -1;
        }
        if(arr[i]==target){
            return i; 
        }
        return Lastocc(arr, target, i-1);
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,5,8};
        System.out.println(Lastocc(arr, 5,8));

    }
}
