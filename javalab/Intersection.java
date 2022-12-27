import java.util.*;
public class Intersection{
    public static void main(String[] args){
        HashSet<String> cars= new HashSet<String>();
        cars.add("BMW");
        cars.add("Lamborghini");
        cars.add("maruti");
        cars.add("Hyundai");
        cars.add("Porshe");
        System.out.println("The first hashset is : "+cars);
        
        HashSet<String>cars1= new HashSet<String>();
        cars1.add("BMW");
        cars1.add("KIA");
        cars1.add("maruti");
        cars1.add("Santro");
        cars1.add("Nissan");
        System.out.println("The second hashset is : "+cars1);
        cars.retainAll(cars1);
        System.out.println("The same elements on both sets are: "+cars);
        System.out.println("Sami Gautam");
    }
}