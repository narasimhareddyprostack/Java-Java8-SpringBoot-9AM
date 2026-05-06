class Emp{}
public class TestFive {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=100;

        Emp e1=new Emp();
        Emp e2=new Emp();
        String s1="Rahul";
        String s2=new String("Rahul");
        Integer i=100;

        System.out.println(e1.equals(s2)); //false
        System.out.println(e1 == s2);
    }
}
