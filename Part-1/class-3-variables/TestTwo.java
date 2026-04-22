public class Test {
    int a=10;
    int b=20;
    static int c=30;
    public static void main(String[] args) {
      Test t1=new Test();
      Test t2=new Test();
      System.out.println(t1.a+t2.b+c);
      t2.b=200;
      System.out.println(t1.a+t2.b+Test.c);
      t1.c=3;
      System.out.println(t1.a+t2.a+t1.c);
      t1.a=1;
      System.out.println(t1.a+t2.a+t1.c);
    }
}
