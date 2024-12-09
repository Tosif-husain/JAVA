
import java.util.Scanner;

class travel{
  String cust_name,to_city,from_city;
  double distance_in_km,dis_in_miles,dis_in_meter;

  void get_details(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter name: ");
    cust_name = sc.nextLine();
    System.out.println("enter to city: ");
    to_city = sc.nextLine();
    System.out.println("enter from city: ");
    from_city = sc.nextLine();
    System.out.println("enter distance (in KM): ");
    distance_in_km = sc.nextDouble();
  }
  
  void convert(){
    dis_in_miles = 0.6213711922 * distance_in_km;
  }
  void convert1(){
    dis_in_meter = distance_in_km * 1000; 
  }

  void put_details(){
    System.out.println("cust name: "+cust_name);
    System.out.println("from city: "+from_city);
    System.out.println("to city: "+to_city);
    System.out.println("distance in km: "+distance_in_km);
    System.out.println("distance in meter: "+dis_in_meter);
    System.out.println("distance in miles: "+dis_in_miles);
  }
}

public class practice {

  public static void main(String[] args) {
    travel tr = new travel();
    tr.get_details();
    tr.convert();
    tr.convert1();
    tr.put_details();
  }
}