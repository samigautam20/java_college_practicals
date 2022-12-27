 class Man {
    int id;
    String name;
}
class UpdatedStudent{
    public static void main(String[] args){
        Man s1= new Man();
        Man s2=new Man();
        s1.id=101;
        s1.name="Jay";
        s2.id=102;
        s2.name="Veeru";
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}
