public class Test {
    public static void main(String[] args) {
        int i=1;
        //int j=++i;//pre-incr:first incr and then assign
        int j=i++;//post-incr:first Assign and then Incr
        System.out.println(i);
        System.out.println(j);
    }
}
