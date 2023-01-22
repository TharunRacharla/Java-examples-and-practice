import java.lang.Commons.Apache.*;
public class ExtractNumberFromString
{ 
   public static void main(String[] args)
{
   String str = "Fox Dog Loin Tiger";
String[] animals = StringUtils.split(str, " ");
System.out.println(Arrays.toString(animals));
// [Fox, Dog, Loin, Tiger]
}
}