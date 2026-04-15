package pack2;
import pack1.A;
public class C extends A {
    public void m2(){
        System.out.println("Public class C-Public method m2()");
    }
    public static void main(String[] args) {
        C c1=new C();
        c1.m1();
    }
     
}