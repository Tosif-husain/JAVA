import java.io.File;
public class file_rename {
	public static void main(String[] args)
	{
		File file = new File("input.txt");

		File rename = new File("input1.txt");

		boolean flag = file.renameTo(rename);

		if (flag == true) {
			System.out.println("File Successfully Rename");
		}
		else {
			System.out.println("Operation Failed");
		}
	}
}
