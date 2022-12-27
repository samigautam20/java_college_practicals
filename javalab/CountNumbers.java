import java.util.*;
public class CountNumbers{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int number, countPositive = 0, countNegative = 0,countZero = 0;
        char choice;
        do{
            System.out.print("Enter the number ");
            number=sc.nextInt();
            if(number > 0){
                countPositive++;
            }
            else if(number < 0){
                countNegative++;
            }
            else{
                countZero++;
            }
            System.out.print("Do you want to continue y/n? ");
            choice=sc.next().charAt(0);
        }while(choice=='y' || choice == 'Y');
        System.out.println("Count of positive numbers: " + countPositive);
        System.out.println("Count of negative numbers: " + countNegative);
        System.out.println("Count of zero numbers: " + countZero);
        System.out.println("Sami Gautam");
    }  
}