package CFTwo;

import java.util.ArrayList;
import java.util.Iterator;

public class ALOne {
    public static void main(String[] args) {
        ArrayList<Integer> eids=new ArrayList<Integer>();
        eids.add(101);
        eids.add(102);
        eids.add(103);
        eids.add(104);
        /*
        ArrayList object we can iterate using
        a)for loop
        b)while loop
        c)do-while loop
        d)for-each loop
        e)iteratror
         */
        Iterator itr=eids.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
