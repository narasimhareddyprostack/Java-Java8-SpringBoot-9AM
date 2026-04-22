public class TestOne {
    public static void main(String[] args) {
       // int i=5++;  //applicable only variable not - literal values
       /*int i=1;
       int j=(i++)++; //nesting of incr/decr op not possible
       */
        final int i=10;
        int j=i++; // cannot assign a value to final variable i
    }
}
