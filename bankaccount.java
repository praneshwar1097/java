import java.util.*;
abstract class BankAccount{
    private String AccountHolderName;
    private double balance;
    
     BankAccount(String AccountHolderName, double balance){
         this.AccountHolderName=AccountHolderName;
         this.balance = balance;
     }
     
     public abstract void displayDetails();
     public abstract void currentBalance();
     
     public String getAccountHolderName(){
         return AccountHolderName;
     }
     
     
    public void setAccountHolderName(String AccountHolderName){
        this.AccountHolderName=AccountHolderName;
    }
     
    public double getbalance(){
        return balance;
    } 
    
    public void setbalance(double balance){
        this.balance = balance;
    }
     public void deposit(double amount){
         if(amount>0){
             balance +=amount;
             System.out.println("Deposited :" + amount);
         }else{
             System.out.println("Invalid Amount");
         }
     }
     public void withdraw(double amount){
         if(amount>0 && amount<=balance){
             balance -=amount;
             System.out.println("Withdrawal Amount :" + amount);
         }else{
             System.out.println("Insufficient amount");
         }
     }
}

class SavingsAccount extends BankAccount{
    public SavingsAccount(String AccountHolderName, double balance){
        super(AccountHolderName, balance);
    }
    
    @Override
    
    public void displayDetails(){
        System.out.println("Savings Account");
        System.out.println("Account Name:" + getAccountHolderName());
        System.out.println("Balance:" + getbalance());
    }
    public void currentBalance()
    {
        System.out.println("Final updated balance:"+ getbalance());
    }
   
}

public class Main{
    public static void main(String[] args){
        BankAccount savings = new SavingsAccount("Bharanidharan.M",2000);
        savings.displayDetails();
        savings.deposit(2000);
        savings.withdraw(500);
        savings.displayDetails();
        savings.currentBalance();
        
    }
}