// superclass
class Person {
     
     String name = "PersonName";
     String subjectName = "Java Programming";
     int[] idNumber = {1,2,3,4,5,6,7,8,9,10}; 
     public void print0(){
         System.out.println("the person belongs to TGPCET");
     }

}

// subclass
class Student21 extends Person {

    public void print1() {
        System.out.println("student is a person and has to a test of" + subjectName + "  subject");
    }
    public void print2(){
        System.out.println("Students have id no." + idNumber[0] + "to" + idNumber[8]);
    }
}
class Teacher21 extends Person {
    public void print3()
    {
        System.out.println("teacher is a person and is taking the test of" + subjectName);
    }
    
    public void print4()
    {
        System.out.println("teacher has id naumber" + idNumber[9]);
    }
}

class Test2 {

    public static void main(String[] args) {
        // creating object of subclass
        Student21 st = new Student21();
        Teacher21 te = new Teacher21();
        st.print0();
        st.print1();
        st.print2();
        te.print3();
        te.print4();
    }
}