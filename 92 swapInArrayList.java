import java.util.Arrays;
import java.util.List;

class swapInArrayList {

    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println("Your entered list is:");
        System.out.println(list);
        swapArray(list,3,7);
        System.out.println("The swapped list is:");
        System.out.println(list);

    }

    public static void swapArray(List<Integer> list , int x , int y){
        int swap = list.get(x);
        list.set(x,list.get(y));
        list.set(y,swap);
    }

}
