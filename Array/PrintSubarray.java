public class PrintSubarray {
    public static void PrintSubArray(int num[]){
        int ts=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){ 
                int end=j;
             for(int k=start;k<=end;k++){//print the subarray
                System.out.print(num[k] + " ");//print the subarray
             } 
             ts++;
             System.out.println();  
        }
       System.out.println(); 
    }
    System.out.println("Total : " + ts); 

}
public static void main(String args[]){
    int num[]={2,3,4,5,6,7};
    PrintSubArray(num);
}
}