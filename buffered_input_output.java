import java.io.*;

public class buffered_input_output {
  public static void main(String[] args) {
    File f = new File("op.txt");
    try {
        if(!f.exists()) {
          f.createNewFile();
          System.out.println("file created");
        }else{
          System.out.println("already exists");
        }
        
        FileOutputStream fout = new FileOutputStream("op.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String str = "my world";
        byte[] b = str.getBytes();
        bout.write(b);
        bout.close();
        System.out.println("write successful");

        FileInputStream fin = new FileInputStream("op.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i;
        while((i=bin.read()) != -1){
          System.out.println((char)i);
        }
        bin.close();

    } catch (IOException e) {
      System.out.println("IOException Generated");
    }
  }
}