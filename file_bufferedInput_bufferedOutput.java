// package file.file;

import java.io.*;

class file_bufferedInput_bufferedOutput
{
	public static void main(String args[])
	{
		File f = new File("test.txt");
		try
		{
			if(!f.exists())
			{
				f.createNewFile();
				System.out.println("File Created");
			}
			else
			{
				System.out.println("File Already Exist...");
			}
			
		//Writing in a file
		FileOutputStream fout = new FileOutputStream("test.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout); //We can store largely data.
		String s = "Hello World...!";
		byte[] b = s.getBytes(); //Storing data in byte format
		bout.write(b);
		bout.close(); //closing file
		System.out.println("Writing Completed...");
			
		//Reading from file
		FileInputStream fin = new FileInputStream("test.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		int i;
		while((i=bin.read()) !=-1) //byte convert into character
		{
			System.out.print((char)i);
		}
		bin.close();
		
		}
		catch(IOException e)
		{
			System.out.println("IOException Generated...!");
		}
	}
}