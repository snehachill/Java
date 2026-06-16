public class BuyandSellStock {
    public static int buyandsell(int price[]){
        int MinPrice=Integer.MAX_VALUE;
        int Maxprofit=0;
        
        for(int i=0;i<price.length;i++){
            if(price[i]<MinPrice){
                MinPrice=price[i];
            }
            else if(price[i]-MinPrice>Maxprofit){
                Maxprofit=price[i]-MinPrice;
            }
            }
            return Maxprofit;
        }
        public static void main(String[] args) {
            int price[]={7, 1, 5, 3, 6, 4};
            System.out.println("The max profit: " +buyandsell(price));
        }
    } 

        