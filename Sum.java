class sum{
    public int intNums(int a, int b, int c){
        int sum=a+b+c;
        return sum;
    }
    public static void main(String[] args){
        int a=7, b=3, c=5;
        sum obj=new sum();
        int answer=obj.intNums(a,b,c);
        System.out.println("The sum of three numbers is "+answer);
    }
}