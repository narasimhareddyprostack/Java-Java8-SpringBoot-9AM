package CFTwo;

import java.util.ArrayList;
import java.util.Collections;

public class ALSix {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        enames.add("Modi");
        enames.add("Amith");
        Collections.sort(enames,Collections.reverseOrder());
        System.out.println(enames);
    }
}
