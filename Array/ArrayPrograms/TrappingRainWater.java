public class TrappingRainWater {
    public static void TrappedRainWater(int height[]){
        int n=height.length;
        
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
          leftMax[i]=Math.max(leftMax[i-1], height[i]);
        }

        int RightMax[]=new int[n];
        RightMax[n-1]=height[n-1];
        for(int i=n-2; i>=0;i--){
            RightMax[i]=Math.max(RightMax[i+1],height[i]);
        }

        int TrappedWater=0;

        for(int i=0;i<n;i++){
           int Waterlevel=Math.min(leftMax[i],RightMax[i]);
              if(Waterlevel>height[i]){
                  TrappedWater=TrappedWater+Waterlevel-height[i];
              }
        }
        System.out.println(TrappedWater);

    }
    public static void main(String[] args) {
        int height[]={4,2,0,5,6};
        TrappedRainWater(height);
        
    }
}