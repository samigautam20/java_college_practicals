import java.util.*;
public class BreakContinue{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number between 0-200");
        int num=input.nextInt();
        int sum1=0, sum2=0;
        while(num>=0 && num<=200){
            while(num>=0 && num<=100){
                sum1+=num;
                System.out.println("Enter next number. Enter negative number to stop");
                num=input.nextInt();
            }
            for(int i=100; i<=200; i++){
                if(i%2==0){
                    sum2+=i;
                    System.out.println("Enter next number.Enter negative number to stop");
                    i=input.nextInt();
                    if(i%2==1){
                        break;
                    }
                }
                System.out.println("Enter even number. Enter negative number to stop");
                num=input.nextInt();
                if(num<0&&num>200){
                    break;
                }
            }
        }
        System.out.println("Sum of positive integers less than 100 is "+sum1);
        System.out.println("Sum of even numbers between 100 to 200 is "+sum2);
        System.out.println("Sami Gautam");
    }
}