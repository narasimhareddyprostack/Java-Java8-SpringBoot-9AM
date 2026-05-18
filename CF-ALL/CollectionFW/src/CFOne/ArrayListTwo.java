package CFOne;

import java.util.ArrayList;

public class ArrayListTwo {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        System.out.println(enames);
        enames.add("RG");
        enames.add("SG");
        enames.add("PG");
        enames.add("Modi");
        System.out.println(enames);
        for (String ename:enames) {
            System.out.println(ename);
        }
    }
}
