import java.util.*;
public class ConvertDistanceMetre{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter distance in metre: ");
        double metre=sc.nextDouble();
        double km=metre/100;
        System.out.println("The distance in km and metre is "+km);
    }
}