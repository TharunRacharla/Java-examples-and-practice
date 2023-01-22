public class Java21dec  //every code is included in classes
{
//had to be Train.java but let it be
    public static void main(String args[])
    {//main method starts here
        int x = 20;
        String mjd = (x<30) ? "it is less" : "it is more";
        String sun = "red";
        String sunc = (sun == "red") ? "sun is red" : "sun is yellow";
        System.out.println(mjd);
        System.out.println(sunc);
        Dayselect d1 = new Dayselect();
        d1.switcha();
        WhilelLearn w1 = new WhilelLearn();
        w1.ddde();
    }//main method ends here
}
//public static void main(String args[])
//name of java file = class name (always)
class Dayselect
{
    int day = 4;
    public void switcha()
    {
        switch (day)
        {
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            case 4 :
                System.out.println("thursday");
                break;
            case 5 :
                System.out.println("friday");
                break;
            case 6 :
                System.out.println("saturday");
                break;
            case 7 :
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
class WhilelLearn
{
    int i = 1;
    public void  ddde()
    {
        while (i<3)
        {
            System.out.println(i);
            i++;
        }
    }
}