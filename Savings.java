class Savings{
    int principal, time, rate;
    public void Interest(){
        int si=(principal*time*rate)/100;
        System.out.println("Simple Interest is "+si);
    }
    public static void main(String[] args){
        Savings obj=new Savings();
        obj.principal=4000;
        obj.time=3;
        obj.rate=20;
        obj.Interest();
    }
}