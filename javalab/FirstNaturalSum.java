import java.util.*;
public class FirstNaturalSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of first natural numbers: ");
        int n=sc.nextInt();
        int squareSum=6*n*(n+1)*(2*n+1);
        System.out.println("The sum square of first "+n+" natural numbers is "+squareSum);
        System.out.println("Sami Gautam");
    }
}