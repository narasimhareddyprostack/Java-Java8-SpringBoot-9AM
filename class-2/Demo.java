public class Demo {
    int eid=101;   // non-static variable eid
    public static void main(String[] args) {
        System.out.println(eid);
    }
}
//error: non-static variable eid 
//cannot be referenced from a static context