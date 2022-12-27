class Display {
    public void display1(){
        System.out.println("Method without Parameter");
    }
    public void display2(int a){
        System.out.println("Method with single parameter: "+a);
    }
    public static void main(String[] args){
        Display object=new Display();
        object.display1();
        object.display2(30);
    }
}