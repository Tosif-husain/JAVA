import java.io.*;

public class fileMethods{
	public static void main(String[] a) {
		try {
		File f=new File("Examples_swing.docx");
		
		System.out.println(f.getName());  // O/P : Name of the file
		System.out.println(f.getPath());	// O/P : Name of the file with path
		System.out.println(f.getParent());	// O/P : D:
		System.out.println(f.lastModified());	// O/P : 1693198820222
		System.out.println(f.getTotalSpace());	// O/P : 290390536192
		System.out.println(f.length());	// O/P : Number of characters available in file
		System.out.println(f.exists());		// O/P : true
		System.out.println(f.isFile());		// O/P : true
		System.out.println(f.isHidden());	// O/P : false
		System.out.println(f.canWrite());	// O/P : true
		System.out.println(f.canRead());	// O/P : true
		//System.out.println(f.delete());
		
		//File f1=new File("test.txt");
		//System.out.println(f.renameTo(f1));
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}		