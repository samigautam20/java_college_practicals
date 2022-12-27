class Employee{
    String name, address;
    int age, salary;
    int p_num;
    public void printSalary(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Phone number: "+p_num);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args){
        Employee obj=new Employee();
        obj.name="Sami";
        obj.address="Gokarna";
        obj.age=19;
        obj.p_num=981111111;
        obj.salary=150000;
        obj.printSalary();
    }
}