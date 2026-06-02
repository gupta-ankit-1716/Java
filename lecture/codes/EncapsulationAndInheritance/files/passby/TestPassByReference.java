package lecture.codes.EncapsulationAndInheritance.files.passby;

import java.awt.*;

import static java.nio.file.Files.move;

public class TestPassByReference {
    static void main(String[] args) {
        Point first  =  new Point(4,8);
        System.out.println("first : " + first);
        move(first);
        System.out.println("first : " +  first);
    }

    public static void move(Point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }
}
