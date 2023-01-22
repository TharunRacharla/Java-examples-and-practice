
class StringBufferTest
{
 public static void main(String args[])
 {    
     StringBuffer sb = new StringBuffer("Welcome");
     sb.append("  Students");
     System.out.println(sb);

     sb.insert(7," IT");
     System.out.println(sb);

     sb.replace(7,10,"Java");
     System.out.println(sb);

     sb.delete(7,11);
     System.out.println(sb);

     System.out.println(sb.charAt(4));

     System.out.println(sb.substring(1));
     
     System.out.println(sb.substring(3,6));
     
     sb.reverse();
     System.out.println(sb);

     System.out.println(sb.capacity());

     StringBuffer sb1 = new StringBuffer();
     System.out.println(sb1.capacity());

     sb1.append("dhdshishidhshsi sidisdhidhsihsh oowwswwwxnsmnmskwk sskso");
     System.out.println(sb1.capacity());

     sb1.ensureCapacity(80);
     System.out.println(sb1.capacity());

     System.out.println(sb.length()); 
    }       
}