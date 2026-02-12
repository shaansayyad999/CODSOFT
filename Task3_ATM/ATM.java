import java.util.Scanner;

public class ATM{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
BankAccount account=new BankAccount(1000);
int choice;
boolean running=true;
System.out.println("----- ATM Machine -----");
while(running){
System.out.println("\n1. Check Balance");
System.out.println("2. Deposit Money");
System.out.println("3. Withdraw Money");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
choice=sc.nextInt();
switch(choice){
case 1:
System.out.println("Current Balance: "+account.getBalance());
break;
case 2:
System.out.print("Enter amount to deposit: ");
double d=sc.nextDouble();
if(account.deposit(d)) System.out.println("Amount deposited successfully.");
else System.out.println("Invalid deposit amount.");
break;
case 3:
System.out.print("Enter amount to withdraw: ");
double w=sc.nextDouble();
if(account.withdraw(w)) System.out.println("Withdrawal successful.");
else System.out.println("Insufficient balance or invalid amount.");
break;
case 4:
running=false;
System.out.println("Thank you for using the ATM.");
break;
default:
System.out.println("Invalid choice. Please try again.");
}
}
sc.close();
}
}
