import java.util.Scanner; 
class Numbers {
    public static void main(String[] args){
        char operator;
        Double num1, num2, sum, product, difference, quo;

        //create an object of scanner class
        Scanner sc= new Scanner(System.in);

        System.out.println("Choose a number for operation: 1(+), 2(-), 3(*), 4(/)");
        operator=sc.next().charAt(0);
        System.out.println("Enter first number: ");
        num1=sc.nextDouble();
        System.out.println("Enter second number: ");
        num2=sc.nextDouble();
        switch(operator){
            case'1':
            sum=num1+num2;
            System.out.println("sum= "+sum);
            break;

            case'2':
            difference=num1-num2;
            System.out.println("Difference= "+difference);
            break;

            case'3':
            product=num1*num2;
            System.out.println("Product= "+product);
            break;

            case'4':
            quo=num1/num2;
            System.out.println("Quotient= "+quo);
            break;
            
            default:
            System.out.println("invalid operator!");
        }
        sc.close();
    }
}
