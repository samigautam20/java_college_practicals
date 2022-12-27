import java.util.Scanner;
public class PrintingApplication{
   public static void main(String[] arg){
     Scanner sc= new Scanner(System.in);
     System.out.println("How many copies do you want to print? ");
     int copies = sc.nextInt();
      if (copies <= 99 && copies > 0){
          System.out.println("$0.30 per copy");
          System.out.printf("TOtal cost 0f printing is Rs %f",copies*0.30);
  } else if (copies >= 100 && copies <= 499){
          System.out.println("$0.28 per copy");
          System.out.printf("TOtal cost of printing is Rs %f",copies*0.28);
 } else if (copies >= 500 && copies <= 799){
          System.out.println("$0.28 per copy");
          System.out.printf("TOtal cost of printing is Rs %f",copies*0.28);
 } else if (copies >= 800 && copies <= 1000){
          System.out.println("$0.26 per copy");
          System.out.printf("TOtal cost of printing is Rs %f",copies*0.26);
 } else if (copies >= 1000){
           System.out.println("$0.25 per copy");
           System.out.printf("TOtal cost of printing is Rs %f",copies*0.2);}
  }
}