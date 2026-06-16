public class ReverseArray {
    public static int Reverse(int number[]){
        int first=0;
        int last=number.length-1;

        while(first < last){
            //swap
             int temp=number[last];
             number[last]=number[first];
             number[first]=temp;
             first++;
             last--;
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={1,2,3,4,5,6,7,8,9};
        Reverse(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}
