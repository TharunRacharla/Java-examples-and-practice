class Practical6a extends Thread
{
 public void run()
{
 System.out.println("thread is running...");
}
public static void main(String args[])
{
 Practical6a t1 = new Practical6a();
t1.start();
}
}