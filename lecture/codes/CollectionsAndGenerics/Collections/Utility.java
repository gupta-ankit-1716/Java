package lecture.codes.CollectionsAndGenerics.Collections;

import java.util.Collection;

public class Utility {
    public static <E> void print(Collection<E> collection){
        System.out.printf("Collection is : ");
        for(E coll : collection){
            System.out.printf(" %s ", coll);
        }
        System.out.println();
    }
}
