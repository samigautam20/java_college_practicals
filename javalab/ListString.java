import java.util.*;
public class ListString{
    public static void main(String[] args){
        List<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Lamborghini");
        cars.add("maruti");
        cars.add("Hyundai");
        cars.add("Porshe");
        System.out.println("The list of cars is "+cars);
        
        //inserting car at first and last position
        cars.add(0,"Mustang");
        cars.add(5,"Ferrari");
        System.out.println("The updated list of cars is "+cars);
        
        //searching value maruti from the list
        if(cars.contains("maruti")){
            System.out.println("The car "+cars.get(3)+" is available");
        }
        else{
            System.out.println("The car is not available");
        }
        
        System.out.println("Sami Gautam");
    }
}