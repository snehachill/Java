public class LinearSearch {
    public static int linearSearch(int number[], int key) {
       for(int i=0;i<number.length;i++){
              if(number[i]==key){
                return i;
              }
       }
       return -1;
    }

    public static void main(String args[]){
        int num[]={8,7,5,9,10,0,1,4,3,2};
        int key=2;
        int index=linearSearch(num,key);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+index);
        }
    }
}

/*public class LinearSearch {
    public static int linearSearch(String dishes[], String key) {
       for(int i=0;i<dishes.length;i++){
              if(dishes[i]==key){
                return i;
              }
       }
       return -1;
    }

    public static void main(String args[]){
        String dishes[]={"Samosa","Chole-Bhature","Dosa","Idli","Momos"};
        String key="Dosa";
        int index=linearSearch(dishes,key);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+index);
        }
    }
}*/
