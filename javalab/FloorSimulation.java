import java.util.Scanner;
public class FloorSimulation{
  public static void main(String[] arg){
   Scanner sc= new Scanner(System.in);
   System.out.println("Please enter your floor number: ");
   int floor = sc.nextInt();
   int actualFloor ;
    if (floor > 13){
      actualFloor = floor -1;
   }
   else {
   actualFloor = floor;
}
   System.out.println("The elevator will travel to the actual floor " + actualFloor);
}
}