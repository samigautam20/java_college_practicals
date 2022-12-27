class average{
    public int putNumbers(int a, int b, int c){
        int average=(a+b+c)/3;
        return average;
    }
    public static void main(String[] args){
        int a=2, b=6, c=9;
        average obj=new average();
        double answer=obj.putNumbers(a,b,c);
        System.out.println("The average of three numbers is "+answer);
        
    }
}