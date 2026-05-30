import java.util.Scanner;

class categorizePerson {

    static void main(String[] args) {
        System.out.println("This is the program to categorize persons based on their age.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age = input.nextInt();
        System.out.printf("Your entered age is %d and %s%n", age, ageCheck(age));


    }

    public static String ageCheck(int age){
        if(age >= 60){
            return "You are a Senior";
        }else if (age >= 20 && age < 60){
            return "You are a Adult.";
        }else if(age >= 13 && age < 20){
            return "You are a Teenager.";
        }else if (age >= 0 && age < 13){
            return "You are a Child.";
        }else{
            return "Invalid age.";
        }
    }

}


// The yellow warning says that the code is valid without the && statement.