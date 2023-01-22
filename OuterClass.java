public class OuterClass{
   int x=15;
 
   class InnerClass{
       void display(){
           System.out.println("\nThe variable x from OuterClass is "+ x);
       }
   }
 
   public static void main(String args[]){
       OuterClass outer = new OuterClass();
       OuterClass.InnerClass inner = outer.new InnerClass();
       inner.display();
   }
}