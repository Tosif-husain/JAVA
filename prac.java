
import java.util.*;

public class prac {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("tosif");
    list.add("husain");
    list.add("ansari");

    list.remove(0);
    list.set(2,"husain");

    for(int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

  }
}