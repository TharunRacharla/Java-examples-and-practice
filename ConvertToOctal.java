public class ConvertToOctal
{
  int decimalNum = 800;
  int octalRadix = 8;
  public static void main(String args[])
  {
    ConvertToOctal convertToOctal = new ConvertToOctal();
    convertToOctal.proceed();
  }
  private void proceed()
  {
    String octalNum = Integer.toString(decimalNum, octalRadix);
    System.out.println("Octal value of" + decimalNum+ " is " + octalNum);
  }
}