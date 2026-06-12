public class Maxprofit {
    public static int Maxprofit(int price[]){
        int Maxprofit=0;
        int Min_Price=price[0];

        for(int i=0;i<price.length;i++){
            if(price[i]<Min_Price){
                Min_Price=price[i];
            }
            else{
                int Current_profit=price[i]-Min_Price;
                if(Current_profit>Maxprofit){
                    Maxprofit=Current_profit;
                }
            }
        }

        return Maxprofit;
    }
    public static void main(String[] args) {
        int price[]={7,1,4,2,3};
        System.out.println("The maxprofit: "+Maxprofit(price));
    }

}
