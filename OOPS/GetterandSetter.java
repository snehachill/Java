public class GetterandSetter {
    public static void main(String[] args) {
        BankAccount myAccount=new BankAccount();
        myAccount.username="Sneha";
        //set balance 
        myAccount.Setbalance(4000);

        System.out.println("Account holder's name: " + myAccount.username);
        System.out.println("Account balance: " + myAccount.getBalance());

    }
    
}
class BankAccount{
    public String username;
    private double balance;

    public void Setbalance(double amount){
      if(amount >=0){
        this.balance=amount;
      }
      else{
        System.out.println("Error:Invalid amount");
      }
    }
    
    public double getBalance() {
        return this.balance;
    }

}
