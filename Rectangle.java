class rectangle{
    int l=6, b=4;
    int area =l*b;
    int perimeter=2*(l+b);
    public void area(){
        System.out.println("Area is "+area);
    }
    public void perimeter(){
        System.out.println("Perimeter is "+perimeter);
    }

}

class rect{
    public static void main(String[] args){
        rectangle obj = new rectangle();
        obj.area();
        obj.perimeter();
        }
}