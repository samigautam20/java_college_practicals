import java.util.*;
public class AreaOfRectangle{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int area;
    System.out.print("Enter length and breadth");
    int length=sc.nextInt();
    int breadth=sc.nextInt();
    area=length*breadth;
    System.out.println("The area of the rectangle is "+area);
    System.out.println("Author- Sami Gautam");
   }
}