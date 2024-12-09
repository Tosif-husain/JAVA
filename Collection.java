import java.util.*;

public class Collection {

   public static void main(String[] args) {
       List<String> arrayList = new ArrayList<>();

       arrayList.add("tosif ");
       arrayList.add("husain ");
       arrayList.add("ansari");

       arrayList.add(2,"tahir");
       arrayList.remove(0);
       arrayList.set(1,"ansari");

       for (int i = 0; i < arrayList.size(); i++) {
           System.out.println(arrayList.get(i));

       }

       if (arrayList.contains("ansari")) {
           System.out.println(arrayList.indexOf("tahir"));
       }else {
           System.out.println("not found");
       }
   }
}

// public class Collection {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.offer(1);

//        for(Integer i : queue) {
//            System.out.printf("%d ", i);
//        }
//    }
// }


// QUESTION 1...

// class varArgs {
//    public static void main(String[] args) {
//        System.out.println(concatenate("tosif"));
//        System.out.println(concatenate("tosif","husain"));
//        System.out.println(concatenate("Tosif husain", "&", "Mant"));
//    }

//    public static String concatenate(String... abcd) {
//        StringBuilder sb = new StringBuilder();
//        for (String str : abcd) {
//            sb.append(str).append(" ");
//        }
//        return sb.toString();
//    }
// }


