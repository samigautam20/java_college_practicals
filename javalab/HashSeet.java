import java.util.*;
public class HashSeet{
    public static void main(String[] args){
        HashSet<String> cars= new HashSet<String>();
        cars.add("BMW");
        cars.add("Lamborghini");
        cars.add("maruti");
        cars.add("Hyundai");
        cars.add("Porshe");
        System.out.println("The hashset is : "+cars);
        
        //creating an array
        String[] carsArray = new String[cars.size()];
        cars.toArray(carsArray);
        
        //Displaying cars in Array
        System.out.println("The Array elements are : ");
        for(String element : carsArray){
            System.out.println(element);
        }
        System.out.println("Sami Gautam");
    }
}