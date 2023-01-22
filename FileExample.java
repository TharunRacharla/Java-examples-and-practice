import java.io.FileOutputStream;

public class FileExample
{
           public static void main(String args[])
           {
                   try{
                                FileOutputStream fout = new FileOutputStream("E:\\File IO.doc");
                                for(int i=65; i<91; i++)
                                     {fout.write(i);}
                                fout.close();
                                System.out.println("success...");
                        }
                   catch(Exception e)
                        {
                               System.out.println(e);
                        }
           }
}