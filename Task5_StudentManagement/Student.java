public class Student{
    String name;
    int rollNumber;
    String grade;
    
    public Student(String n,int r,String g){
    name=n;
    rollNumber=r;
    grade=g;
    }
    
    public int getRollNumber(){
    return rollNumber;
    }
    
    public void displayStudent(){
    System.out.println("Name: "+name);
    System.out.println("Roll Number: "+rollNumber);
    System.out.println("Grade: "+grade);
    System.out.println("----------------------------");
    }
    }
    