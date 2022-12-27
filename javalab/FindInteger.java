public class FindInteger{
    public static void main(String[] args){
        int[] numbers={5, 6, 7, 8, 9};
        int numberToFind =6;
        boolean found=false;
        
        for(int n: numbers){
            if(n == numberToFind){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(numberToFind+" is found");
        }
        else{
            System.out.println(numberToFind+" is not found");
        }
        System.out.println("Sami Gautam");
    }
}