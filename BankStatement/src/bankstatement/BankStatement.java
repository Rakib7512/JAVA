
package bankstatement;

import bankstatement.CerrBal.CarrentBalance;

public class BankStatement {

 
    public static void main(String[] args) {
    
        CarrentBalance cb=new CarrentBalance();
        cb.setBalance(450);
        cb.setWithdrow(20);
        cb.setAccountName("Carrent");
        
      cb.getBalance();
        
        
        
    }
    
}
