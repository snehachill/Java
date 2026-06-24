public class updatebit{
    public static int SetIthbit(int n,int i){
        int mask=1<<i;
        return(n | mask);
    }
    public static int ClearIthbit(int n,int i){
        int mask=~(1<<i);
        return(n & mask);
    }

    public static int updateIthbit(int n,int i,int newbit) {
        if(newbit==0){
            return ClearIthbit(n, i);
        }
        else{
            return SetIthbit(n, i);
        }  
    }
    public static void main(String[] args) {
        System.out.println(updateIthbit(10, 2, 1));
    }
}