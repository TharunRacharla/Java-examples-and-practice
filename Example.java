import java.io.*;
public class Example
{
    public static void main(String args[])
    {
        FileInputStream fis = null;
        //this constructor FileInputStream(File filename) throws FileNotFoundException which is a checked exception
        try {
            fis = new FileInputStream("B:/myfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int k = 0;

        //Method read() of FileInputStream class throws a checked exception: IOException
        while(true)
        {
            try {
                if (((k=fis.read())!=-1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println((char)k);
            //the method close() closes the file Input Stream IOException
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
