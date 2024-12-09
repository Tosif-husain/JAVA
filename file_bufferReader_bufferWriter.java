import java.io.*;
class file_bufferReader_bufferWriter
{
	public static void main(String args[])
	{
		File f = new File("b1.txt");
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
			
			//writing data from file
			FileWriter fw = new FileWriter("b1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			String s="Hello Everyone";
			bw.write(s);
			bw.newLine();
			String s1="Hello";
			bw.write(s1);
			bw.close();
			
			
			// Reading data from file
			FileReader fw1 = new FileReader("b1.txt");
			BufferedReader bin = new BufferedReader(fw1);
			String line;
			while((line = bin.readLine())!=null)
			{
				System.out.println(line);
			}
			bin.close();
		}
		catch(IOException e)
		{
			System.out.println("IOException Generated...!");
		}
	}
}