abstract class  Bank 
{
       abstract float getRateOfInterest();
}
class SBI extends Bank
{
     float getRateOfInterest()
     {
       return 8;
     }
}
class ICICI extends Bank
{
     float getRateOfInterest()
     {
           return 7;
     }
}
class AXIS extends Bank
{
     float getRateOfInterest()
     {
          return 9;
     }
}
class TestBank
{
  public static void main(String args[])
{
 Bank b =  new SBI();
 System.out.println("Rate of interest is :" +b.getRateOfInterest()+ " % ");
b= new ICICI();
System.out.println("Rate of interest is :" +b.getRateOfInterest()+ " % ");
b= new AXIS();
System.out.println("Rate of interest is :" +b.getRateOfInterest()+ " % ");
}
}