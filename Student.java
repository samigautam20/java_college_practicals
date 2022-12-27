class Student {
    String name = "John";
    int roll_no = 2;
    
    public void stats() {
    System.out.println("My name is "+ name);
    System.out.println("His roll no is "+ roll_no);
    }
    }
    
    class Main {
    public static void main(String[] args) {
    Student n = new Student();
    Student r = new Student();
    System.out.println(n.name);
    System.out.println(r.roll_no);
    n.stats();
    System.out.println("Sami Gautam");
    }
    }