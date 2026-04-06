public class Test {
    int a=10;
    int b=20;
    static int c=30;
    public static void main(String[] args) {
        //How to access static vairable
        System.out.println(Test.c);
        System.out.println(c);
        System.out.println(new Test().c);
        
        Test t1=new Test();
        System.out.println(t1.c);
        /*
        1.using Class Name
        2.using directly in static context
        3.using object
         */
    }
}
