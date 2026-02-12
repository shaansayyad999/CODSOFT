public class BankAccount{
    double balance;
    
    public BankAccount(double b){
    if(b>=0) balance=b;
    else balance=0;
    }
    
    public double getBalance(){
    return balance;
    }
    
    public boolean deposit(double a){
    if(a>0){
    balance+=a;
    return true;
    }
    return false;
    }
    
    public boolean withdraw(double a){
    if(a>0&&a<=balance){
    balance-=a;
    return true;
    }
    return false;
    }
    }
    