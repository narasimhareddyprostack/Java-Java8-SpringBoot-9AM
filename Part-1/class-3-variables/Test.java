public class Test {
    byte b=10;   //-128 to 127
    short s=100;
    int eid=101;
    long mobile=9591619191l;
    float esal=45000.45f;
    double rating=4.5;
    char avail='Y';
    boolean discount=true;

    public static void main(String[] args) {
      Test t1=new Test();
      System.out.println(t1.b);
      System.out.println(t1.s);
      System.out.println(t1.eid);
      System.out.println(t1.mobile);
      System.out.println(t1.esal);
      System.out.println(t1.rating);
      System.out.println(t1.avail);
      System.out.println(t1.discount);
    }
}
