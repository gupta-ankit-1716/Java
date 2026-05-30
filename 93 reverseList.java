import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class reverseList {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,7,8,9,0);
        System.out.println("The entered list is:");
        System.out.println(list);
        System.out.println("The reversed list is:");
        reverse(list);
        System.out.println(list);
    }

    public static void reverse(List<Integer> list){
        //Collections.reverse(List);
        for(int i = 0; i < list.size()/2; i++){
            swapInArrayList.swapArray(list, i , list.size()-1-i);
        }
    }
}
