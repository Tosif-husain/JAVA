import java.io.*;

public class file_create{
	public static void main(String[] a) {
		try {
//			File f=new File("C://temp.txt");	// Error
			File f=new File("temp1.txt");
			f.createNewFile();
		
		}catch(IOException e) {
			System.out.println("Error"+e);
		}
	}
}		