package CFTwo;

import java.util.*;

public class ALThree {
    public static void main(String[] args) {
          List<Integer> numbers= Arrays.asList(48,2,18,11,31);

          ArrayList al=new ArrayList<>();
          System.out.println(al);  //[]

          al.addAll(numbers);      //[48,2,18,11,31]
          System.out.println(al);

          Collections.sort(numbers);

          System.out.println(numbers);

    }
}
