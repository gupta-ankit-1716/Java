package programming_Challenges.challenge81;

public class equalsAndHashCodeTest {

    static void main(String[] args) {
        Person person1 = new Person("Oggy" , 23, "E0123");
        Person person2 = new Person("Jack" , 25, "E0125");

        if(person1.equals(person2)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equal");
        }

    }

}
