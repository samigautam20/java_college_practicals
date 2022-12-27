//program to calculate factorial
import java.util.*;
public class Factorial{
    public static void main(String[] args){
        //declaring and initializing variables
        int fact=1, i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for factorial : ");
        int num=sc.nextInt();
        
        //using loop
        while(i<=num){
            fact=fact*i;
            i++;
    }
    System.out.println("The factorial of given "+num+" is "+fact);
    System.out.println("Sami Gautam");
}
}