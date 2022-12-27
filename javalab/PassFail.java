import java.util.*;
public class PassFail{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double m1,m2,m3,m4,m5, total, percent, grade;
        System.out.println("Enter Nepali marks: ");
        m1=sc.nextDouble();
        System.out.println("Enter English marks: ");
        m2=sc.nextDouble();
        System.out.println("Enter math marks: ");
        m3=sc.nextDouble();
        System.out.println("Enter social marks: ");
        m4=sc.nextDouble();
        System.out.println("Enter physics marks: ");
        m5=sc.nextDouble();
        total=m1+m2+m3+m4+m5;
        percent=(m1+m2+m3+m4+m5)*100/500;
        System.out.println("Total marks= "+total);
        System.out.println("Percentage= "+percent);
        if(percent<=30){
            System.out.println("Your grade is C");
        }
        else if(percent<=60&&percent>30){
            System.out.println("Your grade is B");
        }
        else {
            System.out.println("Your grade is A");
        }
        System.out.println("Sami Gautam");
    }
}