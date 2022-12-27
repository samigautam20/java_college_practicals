import java.util.*;
public class CoinPattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your amount of money:");
        int money=sc.nextInt();
        System.out.println("Change "+"50p "+"20p "+"10p "+"5p "+"2p "+" 1p ");
        while(money>0){
            int fifties=money/50;
            int rest=money%50;
            int twenties=rest/20;
            int rest2=rest%20;
            int tens=rest2/10;
            int rest3=rest2%10;
            int fives=rest3/5;
            int rest4=rest3%5;
            int twos=rest4/2;
            int rest5=rest4%2;
            int ones=rest5;
            System.out.println(money+"    "+fifties+"     "+twenties+"     "+tens+"     "+fives+"     "+twos+"     "+ones);
            money=sc.nextInt();
            if(money<=0){
                break;
            }
        }
        System.out.println("Immeasurable value!");
        System.out.println("Sami Gautam");
    }
}