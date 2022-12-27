public class Veeru {
    String man="Veeru";
    int id = 102;
    public static void main(String[] args){
        Veeru myObj1=new Veeru();
        Veeru myObj2=new Veeru();
        System.out.println("Name is: "+myObj1.man);
        myObj2.id=666;
        System.out.println("Updated Id: "+myObj2.id);
    }
}
