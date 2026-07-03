public class firstoccurence {
    public static int FirstOcc(int arr[],int target,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return FirstOcc(arr, target, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,5,8};
        System.out.println(FirstOcc(arr, 5, 0));
    }
}
