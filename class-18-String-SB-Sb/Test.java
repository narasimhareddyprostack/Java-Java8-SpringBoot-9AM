class Emp{}
public class Test {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=100;

        Emp e1=new Emp();
        Emp e2=new Emp();
        String s1="Rahul";
        String s2=new String("Rahul");
        Integer i=100;

        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
    }
}
