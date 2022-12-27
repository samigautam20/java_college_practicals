import java.util.*;
public class SumPositiveIntegers{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number between 0 to 200: ");
        int num=input.nextInt();
        int sum=0;
        while(num<100 && num>=0){
            sum+=num;
            System.out.println("Enter number between 0 to 200. Enter -ve number to stop");
            num=input.nextInt();
        }
        System.out.println("Sum of positive integers between 0 to 100 is "+sum);
        System.out.println("Sami Gautam");
    }
}