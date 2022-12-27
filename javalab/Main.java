//Sami Gautam
import java.util.*;
import java.io.*;
public class Main { 
    public static void main(String[] args) { 
    int num; 
    int product = 1;
    Scanner console=new Scanner(System.in);
    String a =console.nextLine(); 
    num = Integer.parseInt(a);
    System.out.println("Enter a number");
    while (num != 0) { 
    product = product * num;
    a =console.nextLine(); 
    num = Integer.parseInt(a);
    System.out.println("Enter first number");
    } 
    System.out.printf("product = %d", product); 
    } 
    }