package bankstatement.account;

public class Account {

    public String accountName;
    public double balance;

    public Account() {
    }

    public Account(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void getWithrow(double amount) {

        if (balance > amount &&amount>0) {

            System.out.println(balance - amount+"Withdrawn successfully");
        } else {
            System.out.println("Envalid Balance");

        }

    }
    
 
    public void getSevinngs(double amount){
    
        if(amount>0){
            System.out.println("Before Sevings Balance: "+balance);
            System.out.println("After Sevings Balance: "+balance+amount);
        
        
        }
    
    }

    public void getAccBalance() {

        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: " + balance);
    }
}
