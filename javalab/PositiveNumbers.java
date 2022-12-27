//author-Sami Gautam
//program to find the sum of positive numbers
import java.util.*;
public class PositiveNumbers{
    public static void main(String[] args){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number=sc.nextInt();
        
        //using loop
        while(number>=0){
            sum+=number;
            System.out.println("Enter a number : ");
            number=sc.nextInt();
        }
        System.out.println("The sum of positive numbers is "+sum);
    }
}