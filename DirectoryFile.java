import java.io.*;
class DirectoryFile 
{
 public static void main(String[] args) 
{ 
//System.getProperty returns absolute path 
   File f = new File(System.getProperty("user.dir")+"/prog123/poem.txt"); 
     if(!f.getParentFile().exists())  
              { 
            f.getParentFile().mkdirs(); 
              } 
  //Remove if clause if you want to overwrite file 
   if(!f.exists()) 
      {
           try 
               { 
                  f.createNewFile();
               }
          catch (Exception e) 
              {
                  e.printStackTrace();
              }
 } 
          try 
              {
                //dir will change directory and specifies file name for writer 
                File dir = new File(f.getParentFile(), f.getName());
                PrintWriter writer = new PrintWriter(dir);
                writer.print("writing anything...");
                writer.close();
              }
       catch (FileNotFoundException e)
             {
                e.printStackTrace();
             }
}
}