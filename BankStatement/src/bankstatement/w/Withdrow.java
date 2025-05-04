
package bankstatement.w;

import bankstatement.account.Account;


public class Withdrow extends Account{

    public Withdrow() {
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

    @Override
    public void getWithrow(double amount) {
        super.getWithrow(amount); 
    }
    
}
