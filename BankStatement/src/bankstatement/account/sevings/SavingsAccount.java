
package bankstatement.account.sevings;

import bankstatement.account.Account;

public class SavingsAccount extends Account {
    double interestrate;

    public SavingsAccount() {
    }

    public SavingsAccount(double interestrate) {
        this.interestrate = interestrate;
    }

    public double getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(double interestrate) {
        this.interestrate = interestrate;
    }

    @Override
    public void getSevinngs(double amount) {
        super.getSevinngs(amount); 
    }

   
    
    
}
