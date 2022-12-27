import java.util.*;
public class UpdatedList{
    public static void main(String[] args){
        List fruit = new ArrayList (Arrays.asList("apple","banana","pear","cherry"));
        System.out.println("The initial list is: "+fruit);
        fruit.set(0,"Grapefruit");
        fruit.set(2,"Date");
        fruit.add(4,"Orange");
        System.out.println("The updated list is: "+fruit);
        System.out.println("Sami Gautam");
    }
}