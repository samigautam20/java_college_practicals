import java.util.*;
public class RockPaperScissor{
    public static void main(String[] args){
        Scanner random=new Scanner(System.in);
        System.out.println("Welcome to the game!");
        System.out.println("Select any numbers 1, 2, 3 to play rock paper scissors and select 4 to quit the game ");
        String []option={"Rock","Paper","Scissors","Quit"};
        int select=random.nextInt();
        while(select!=4){
            switch(select){
            case 1:
                int user=random.nextInt();
                if(user==1){
                        select=random.nextInt();
                    System.out.println("Draw");
                }
                if(user==2){
                        select=random.nextInt();
                    System.out.println("You won ! press 4 to exit or else to continue");
                }
                if(user==3){
                        select=random.nextInt();
                    System.out.println("Cpu won press 4 to exit or else to continue");
                }
                break;

            case 2:
                user=random.nextInt();
                if(user==1){
                        select=random.nextInt();
                    System.out.println("Cpu won press 4 to exit or else to continue");
                }
                if(user==2){
                        select=random.nextInt();
                    System.out.println("Draw");
                }
                if(user==3){
                        select=random.nextInt();
                    System.out.println("You won ! press 4 to exit or else to continue");
                }
                break;

            case 3:
                 user=random.nextInt();
                if(user==1){
                        select=random.nextInt();
                    System.out.println("You won ! press 4 to exit or else to continue");
                }
                if(user==2){
                    select=random.nextInt();
                    System.out.println("Cpu won press 4 to exit or else to continue");
                }
                if(user==3){
                        select=random.nextInt();
                        System.out.println("Draw");
                                }
             default: 
                 {
                            System.out.println("Game over");
                        }
    }
}
System.out.println("Sami Gautam");
}
}