import java.io.*;
public class fileWriter_fileReader {

   public static void main(String args[]) {

      FileWriter fw = null;

      try 
	  {
		File f=new File("temp1.txt");
		f.createNewFile();

        fw = new FileWriter("temp1.txt");
		String str="New File!!!";
		fw.write(str);
		/*for (int i = 0; i < str.length(); i++)
		{
		    char c=str.charAt(i);
	            fw.write(c);
		}*/
		fw.close();
        
		FileReader fr=new FileReader("temp1.txt");    
        int i;    
        while((i=fr.read())!=-1)
		{
			System.out.print((char)i);    
		}		
        fr.close();    
      }
		
		
	catch(IOException e)
	{
		System.out.println(e);
	}
	
  }
}
		