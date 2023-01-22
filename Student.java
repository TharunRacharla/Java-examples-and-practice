import java.util.*;
class Student
{
    Scanner sc= new Scanner(System.in);   
    int regNo,total=0,subjects;
    String name;
    int marks[];
    Student()
    {
      System.out.println("Enter registration no."); 
      regNo=sc.nextInt();
     System.out.print("Enter student name:");
    name=sc.next();
    getDisMarks();    
 }
  public void getDisMarks()
  {
   marks=new int[3];
   System.out.print("Enter marks of physics:");
   marks[0]=sc.nextInt();
   System.out.print("Enter marks of chemistry:");
   marks[1]=sc.nextInt();
   System.out.print("Enter marks of maths :");
   marks[2]=sc.nextInt();
   for(int i=0;i<3;i++)
    {
        total+=marks[i];       //total=total+marks[i]
    } 
   System.out.println("Total marks of student"+name+":"+total);
   }
public void print0() {
}
public void print2() {
}
public void print3() {
}
}
  class StudentDemo
{
  public static void main(String[] args)
  {
    Student s[]= new Student[5];   //Student s=new student();
    for(int i=0;i<5;i++)
    {
      s[i] = new Student();
    }
  }
   
} 