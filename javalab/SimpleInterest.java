import java.util.*;
public class SimpleInterest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal, rate and time : ");
        double p=sc.nextDouble();
        double rate=sc.nextDouble();
        double time=sc.nextDouble();
        double si=(p*rate*time)/100;
        double amnt=p+si;
        System.out.println("The simple interest is "+si+" and the total amount is "+amnt);
        System.out.println("Sami Gautam");
    }
}