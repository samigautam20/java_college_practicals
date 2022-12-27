import java.util.*;
public class NumbersTriangle{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number for pattern : ");
        int n=input.nextInt();
        int x=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=i; k>=1; k--){
                System.out.print(k);
            }
            for(int l=1; l<=i; l++){
                if(l==1){
                    continue;
                }
                System.out.print(l);
            }
            System.out.println();
        }
        System.out.println("Sami Gautam");
    }
}