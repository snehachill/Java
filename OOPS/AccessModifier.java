public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(); 
        myAccount.username = "Sneha";
        myAccount.setPassword("asdfhhjwe");

        BankAccount broAccount=new BankAccount();
        broAccount.username="Aryan";
        broAccount.setPassword("asdqwer");
        
        System.out.println("Account Owner: " + myAccount.username );
        System.out.println("Account Owner: " + broAccount.username );
    }
}

class BankAccount {
    public String username;  
    private String password;  

    //changing password
    public void setPassword(String pwd) {
        password = pwd;
    }
}