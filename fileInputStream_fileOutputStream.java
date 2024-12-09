import java.io.*;
public class fileInputStream_fileOutputStream {

   public static void main(String args[]){        
    FileInputStream in = null;
    FileOutputStream out = null;

    try {
		File f=new File("write.txt");
		if(!f.exists())
		{
			f.createNewFile();
		}
		
        in = new FileInputStream("write.txt");
        out = new FileOutputStream("write.txt");
		String str="New File created!!!";
		
		for (int i = 0; i < str.length(); i++)
		{
		    char c=str.charAt(i);
	        out.write(c);
			
		}
		out.close();
		
		int i;    
        while((i=in.read())!=-1)
		{
			System.out.print((char)i);    
		}		
        in.close(); 
	
         
	}
	catch(Exception e)
	{
		System.out.println("Error in file creation");
	}
   }
}