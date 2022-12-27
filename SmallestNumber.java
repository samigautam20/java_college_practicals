import java.util.*;
public class SmallestNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        double a=sc.nextDouble();
        System.out.println("Enter the seecond number: ");
        double b=sc.nextDouble();
        System.out.println("Enter the 3rd number: ");
        double c=sc.nextDouble();
        System.out.println("The smallest value is "+smallest(a,b,c)+"\n");
    }
    public static double smallest(double a, double b, double c){
        return Math.min(Math.min(a,b),c);
    }
}
