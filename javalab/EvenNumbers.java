public class EvenNumbers{
    public static void main(String[] args){
        int sum=0;
        for(int i=100; i<=200; i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("The sum of even numbers from 100 to 200 is "+sum);
        System.out.println("Sami Gautam");
    }
}