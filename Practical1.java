import java.util.*;
class StudentDemo1
{
    Scanner sc= new Scanner(System.in);   
    int regNo,total=0,subjects;
    String name;
    int marks[];
    StudentDemo1()
    {
        System.out.println("Enter details of 5 students:");
        for(int i=1;i<=5;i++) {
            System.out.print("Enter registration no. of student "+i+" :");
            regNo = sc.nextInt();
            System.out.print("Enter student "+i+" name:");
            name = sc.next() + sc.next();
            System.out.println("Student "+i+" name is :" + name);
            getDisMarks();
        }
    }
  public void getDisMarks()
  {
   marks=new int[6];
   System.out.print("Enter marks of Java Programming:");
   marks[0]=sc.nextInt();
   System.out.print("Enter marks of DAA:");
   marks[1]=sc.nextInt();
   System.out.print("Enter marks of Software Engg. :");
   marks[2]=sc.nextInt();
 System.out.print("Enter marks of System programming :");
   marks[3]=sc.nextInt();
 System.out.print("Enter marks of IEED :");
   marks[4]=sc.nextInt();
 System.out.print("Enter marks of Computer Graphics :");
   marks[5]=sc.nextInt();
   for(int i=0;i<6;i++)
    {
        total+=marks[i];       //total=total+marks[i]
    } 
   System.out.println("Total marks of student"+name+":"+total);
   }
  public static void main(String[] args) {
      StudentDemo1 sd1 = new StudentDemo1();
  } }