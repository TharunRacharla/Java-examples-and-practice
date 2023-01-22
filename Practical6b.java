class Practical6b implements Runnable
{
 public void run()
{
 System.out.println("thread is running...");
}
public static void main(String args[])
{
 Practical6b m1 = new Practical6b();
Thread t1 = new Thread(m1);
t1.start();
}
}