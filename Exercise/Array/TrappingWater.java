public class TrappingWater {
    public static int TrappedWater(int height[]){
        int n=height.length;

        int Max_left[] = new int[n];
        int Max_Right[] = new int[n];
       
        Max_left[0]=height[0];
        for(int i=1;i<n;i++){
             Max_left[i]=Math.max(Max_left[i-1], height[i]);
        }

        Max_Right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            Max_Right[i]=Math.max(Max_Right[i+1],height[i]);
        }
        
        int TotalTrappedWater=0;
        for(int i=0;i<n;i++){
            int Water=Math.min(Max_Right[i],Max_left[i]);
            TotalTrappedWater+=Water - height[i];
         }
         return TotalTrappedWater;
        }

        public static void main(String[] args) {
            int height[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1}  ;
            System.out.println("TotalTrappedWater:"+TrappedWater(height));
        }
   
}
