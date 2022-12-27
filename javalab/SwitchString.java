//Sami Gautam
import java.util.*;
public class SwitchString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("We have : cadbury, kitkat, snickers, silk.");
        System.out.println("Enter your choice of chocolate : ");
        String choco=sc.nextLine();
        switch(choco){
            case"cadbury":
             System.out.println("The price of cadbury is Rs.50");
            break;
            case"kitkat":
             System.out.println("The price of kitkat is Rs.40");
            break;
            case"snickers":
             System.out.println("The price of snickers is Rs.55");
            break;
            case"silk":
             System.out.println("The price of silk is Rs.100");
            break;
            default:
                System.out.println("We don't have your selected chocolate here. Sorry!");
        }
    }
}