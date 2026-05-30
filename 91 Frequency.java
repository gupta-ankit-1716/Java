import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Frequency {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,2,5,4,6,4,5,3,56,6,7,4);
        System.out.println("Your entered list is:");
        System.out.println(list);
        System.out.println(Collections.frequency(list, 1));
        System.out.println(Collections.frequency(list, 4));
        System.out.println(Collections.frequency(list, 5));
        System.out.println(Collections.frequency(list, 6));
        System.out.println(Collections.frequency(list, 7));

    }
}
