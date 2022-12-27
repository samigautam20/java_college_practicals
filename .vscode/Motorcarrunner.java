public class Motorcarrunner{
    public static void main(String[] args){
        motorcars bugatti=new motorcars();
        motorcars lamborghini=new motorcars();
        bugatti.start();
        bugatti.setSpeed(150);
        System.out.println("The speed of car is "+bugatti.getSpeed()+" km/s");
        lamborghini.start();
        lamborghini.setSpeed(120);
        System.out.println("The speed of car is "+lamborghini.getSpeed()+" km/s");
    }
}