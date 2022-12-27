import java.util.*;
public class power {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter the number here : ");
       int num1= sc.nextInt();
       System.out.println("Enter the power for that number : ");
       int num2= sc.nextInt();
       int power=1;
       if (num2>= 1) {
           for (int i = 1; i <= num2; i++) {
               power*=num1;
           }
           System.out.println(power);
       }
       System.out.println("Sami Gautam");
   }
}