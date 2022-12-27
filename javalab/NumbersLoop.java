import java.util.*;
public class NumbersLoop{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number for pattern : ");
        int n=input.nextInt();
        int x=0;
        for(int i=1; i<=n; i++, x=0){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            while(x!=2*i-1){
                System.out.print(i);
                x++;
            }
            System.out.println();
        }
        System.out.println("Sami Gautam");
    }
}