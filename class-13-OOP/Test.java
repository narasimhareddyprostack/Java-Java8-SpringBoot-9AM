public class Test {
    public Test(){
        System.out.println("Test Class  constructor");
    }
    public void m1(){
        System.out.println("m1 method");
    }
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        t1.m1();
        t1.m1();
    }
    
}
