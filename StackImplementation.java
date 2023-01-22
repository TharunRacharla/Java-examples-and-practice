import java.util.Stack;
public class StackImplementation
{
  //stack is an in-built class in java 
  public static void main(String[] args)
  {
    // Stack s1 = new Stack();
   Stack<Integer> s1 = new Stack<>();
   s1.push(2);
   s1.push(4);  
   s1.push(9);
/*   System.out.println(s1);
   s1.pop();
   System.out.println(s1);
   System.out.println(s1.peek());
   boolean status =  s1.isEmpty();
   System.out.println(s1.isEmpty());
   s1.pop();
   System.out.println(s1.isEmpty());
   s1.pop();
   System.out.println(s1.isEmpty());
   System.out.println(s1.search(9));
*/
    Iterator it = s1.iterator();
    while(it.hasNext())
    { 
        Object s2 = it.next();
        System.out.println(s2);
    }
  }
}
