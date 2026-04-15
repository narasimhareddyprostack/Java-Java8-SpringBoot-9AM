class Parent{
    public void m1(){System.out.println("Parent class m1 mtehod");}
    public void m2(){System.out.println("Parent class m2 mtehod");}
    final public void m3(){System.out.println("Parent class m3 mtehod");}
}
class Child extends Parent{
    public void m4(){System.out.println("Child class m4 mtehod");}
    public void m1(){System.out.println("Child class m1 overring mtehod");}  //method overriding
    public void m3(){}
}
public class TestTwo {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
        c1.m4();

    }
}
