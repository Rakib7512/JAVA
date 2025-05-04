
package bankstatement.CerrBal;

import bankstatement.account.Account;

public class CarrentBalance extends Account{
    private double withdrow;

    public CarrentBalance() {
    }

    public double getWithdrow() {
        return withdrow;
    }

    public void setWithdrow(double withdrow) {
        this.withdrow = withdrow;
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
    public void getAccBalance() {
        super.getAccBalance(); 
        
    }
    
}
