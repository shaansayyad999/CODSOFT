import java.util.Scanner;

public class GradeCalculator{
static Scanner sc=new Scanner(System.in);

public static void main(String[] args){
System.out.println("----- Student Grade Calculator -----");
System.out.print("Enter number of subjects: ");
int n=sc.nextInt();
if(n<=0){
System.out.println("Invalid number of subjects.");
return;
}
int total=0;
for(int i=1;i<=n;i++){
System.out.print("Enter marks for subject "+i+" (out of 100): ");
int m=sc.nextInt();
if(m<0||m>100){
System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
i--;
continue;
}
total+=m;
}
double avg=(double)total/n;
String grade;
if(avg>=90) grade="A+";
else if(avg>=80) grade="A";
else if(avg>=70) grade="B";
else if(avg>=60) grade="C";
else if(avg>=50) grade="D";
else grade="F";
System.out.println("\n----- Result -----");
System.out.println("Total Marks: "+total);
System.out.println("Average Percentage: "+avg+"%");
System.out.println("Grade: "+grade);
sc.close();
}
}
