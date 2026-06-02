package lecture.codes.EncapsulationAndInheritance.files.equals;

public class EqualsAndHashCodeTest {
    static void main(String[] args) {
        Person person1 = new Person("Oggy",20, "OGG01" );
        Person person2 = new Person("Jack",22, "OJJ02" );

        if(person1.equals(person2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equal");
        }

    }

}
