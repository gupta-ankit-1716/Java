package lecture.codes.CollectionsAndGenerics.Collections;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    static void main(String[] args) {
        List<String> strList = new ArrayList<>();

        strList.add("Oggy");
        strList.add("Jack");

        strList.add(1, "Olivia");
        strList.remove(0);

        if(strList.contains("Oggy")){
            System.out.println(strList.indexOf("Oggy"));
        }

        for(int i = 0; i < strList.size(); i++ ){
            System.out.println(strList.get(i));
        }

        for(String str :strList){
            System.out.println(str);
        }
    }


}
