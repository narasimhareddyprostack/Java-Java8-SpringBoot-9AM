package CFTwo;

import java.util.ArrayList;

public class ALFive {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        enames.add("Modi");
        enames.add("Amith");
        enames.set(2,"Vijay");
        System.out.println(enames);
        System.out.println(enames.get(2));
    }
}
