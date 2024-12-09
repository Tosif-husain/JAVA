import java.io.*;

public class file_delete {
	public static void main(String[] args)
	{
		File file= new File("input1.txt");

		if (file.delete()) {
			System.out.println("File deleted successfully");
		}
		else {
			System.out.println("Failed to delete the file");
		}
	}
}
