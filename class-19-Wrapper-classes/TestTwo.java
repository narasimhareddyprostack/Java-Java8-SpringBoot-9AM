public class TestTwo {
    public static void main(String[] args) {
        int a=100;
        //Integer b=Integer.valueOf(a);
        Integer b=a; //Auto Boxing
        System.out.println(a);
        System.out.println(b);
        
        int c=b;//Unboxing
        //int c=b.intValue();
        System.out.println(c);
    }
}
