import java.util.*;
public class Conditional{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your age : ");
        int age=sc.nextInt();
        if(age>=50){
          System.out.println("Senior"); 
        }
        else if(age<50 && age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("A child");
        }
        System.out.println("Sami Gautam");
    }
}
