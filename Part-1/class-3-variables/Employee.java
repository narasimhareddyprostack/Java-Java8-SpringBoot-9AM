public class Employee {
    public static void calc_Salary(){
        System.out.println("static Method");
    }
    public String get_Emp(){
        return "Rahul";
    }
    public void set_Emp(){
        System.out.println("Setting Emplyee Details");
    }
    public static void main(String[] args) {
        calc_Salary();
        int a=100;
        Employee e1=new Employee();
        String ename=e1.get_Emp();
        System.out.println(ename);
        e1.set_Emp();
    }
    
}
