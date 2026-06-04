package lecture.codes.CollectionsAndGenerics.Collections;

import jdk.jshell.execution.Util;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    static void main() {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Oggy"));
        System.out.println(names.add("Jack"));
        System.out.println(names.add("Bob"));
        Utility.print(names);

        System.out.println(names.add("Olivia"));
        System.out.println(names.size());
        Utility.print(names);

        System.out.println(names.contains("Oggy"));
        System.out.println(names.remove("Jack"));
        Utility.print(names);
        System.out.println(names.remove("Bob"));


    }
}
