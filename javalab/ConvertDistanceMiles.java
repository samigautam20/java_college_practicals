import java.util.*;
public class ConvertDistanceMiles{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double mile;
        System.out.println("Enter distance in km: ");
        double km=sc.nextDouble();
        mile=km/1.60;
        System.out.println("The distance in miles is "+mile);
        System.out.println("Author- Sami Gautam");
    }
}
