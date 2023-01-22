public class Learnarr
{
    public void myMethod(String x)
    {
        System.out.println("we have a birthday candidate for today i.e. " + x);
    }
    public void myMethod1(String fname, int age)
    {
        System.out.println(fname + " is " + age + " years old.");
    }
    public void myMethod2()
    {

    }
    public static void main(String[] args)
    {
        Learnarr a1 = new Learnarr();
        a1.myMethod("Raju");
        a1.myMethod1("Raju",40);
    }
}
