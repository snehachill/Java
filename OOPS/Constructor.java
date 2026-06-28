public class Constructor {
    public static void main(String[] args) {
    BankAccount myAccount=new BankAccount();

    System.out.println("Account holder:" + myAccount.username);
    System.out.println("Account balance:" + myAccount.getBalance());

}
}
class BankAccount{
    public String username;
    private double balance;

    BankAccount(){
        System.out.println("Welcome to the bank...!!");
        this.username="guest";
        this.balance=500;
    }

    public double getBalance(){
        return this.balance;
    }
}
