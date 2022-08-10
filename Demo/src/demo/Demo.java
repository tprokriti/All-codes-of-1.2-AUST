

package demo;


public class Demo {

  
    public static void main(String[] args) {
     Account rahimAccount = new Account();
     
     double depositedAmount = 500;
        System.out.println("Rahim account balance");
        rahimAccount.setBalance(rahimAccount.getBalance() + depositedAmount);
     //rahimAccount.balance += depositedAmount;
        System.out.println("Current balance:"+rahimAccount.getBalance());
        
       // System.out.println("current balance"+rahimAccount.balance);
        
        double withdrawAmount = 200;
        System.out.println("Rahim account balance");
        rahimAccount.setBalance(rahimAccount.getBalance() - withdrawAmount);
        //rahimAccount.balance -= withdrawAmount;
        System.out.println("current balance:"+rahimAccount.getBalance());
        
        
    }

}
