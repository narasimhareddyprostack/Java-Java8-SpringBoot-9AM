package CFTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ALFour {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(48,2,18,11,31);
        /*
            Default Sorting is - Natural Sorting Order ie Asending order
         */
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);
    }
}
