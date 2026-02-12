import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{
static Scanner sc=new Scanner(System.in);
static Random random=new Random();

public static void main(String[] args){
int totalRoundsWon=0;
boolean playAgain=true;
System.out.println("===== Welcome to Number Guessing Game =====");
while(playAgain){
if(playRound()) totalRoundsWon++;
playAgain=askReplay();
}
System.out.println("\n===== Game Over =====");
System.out.println("Total Rounds Won: "+totalRoundsWon);
System.out.println("Thank you for playing!");
sc.close();
}

static boolean playRound(){
int min=1,max=100,maxAttempts=7;
int number=generateNumber(min,max);
int attempts=0;
System.out.println("\nI generated a number between "+min+" and "+max);
System.out.println("You have "+maxAttempts+" attempts.");
while(attempts<maxAttempts){
System.out.print("\nEnter guess: ");
int guess=sc.nextInt();
attempts++;
if(guess==number){
System.out.println("Correct! Guessed in "+attempts+" attempts.");
return true;
}
if(guess>number) System.out.println("Too high!");
else System.out.println("Too low!");
System.out.println("Remaining attempts: "+(maxAttempts-attempts));
}
System.out.println("\nOut of attempts. Number was: "+number);
return false;
}

static int generateNumber(int min,int max){
return random.nextInt(max-min+1)+min;
}

static boolean askReplay(){
System.out.print("\nPlay again? (yes/no): ");
String r=sc.next();
return r.equalsIgnoreCase("yes");
}
}
