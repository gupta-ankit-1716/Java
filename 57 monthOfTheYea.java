import java.util.Scanner;

class monthOfTheYea {

    static void main(String[] args) {
        System.out.println("Yearly Calendar");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number:");
        int month = input.nextInt();
        System.out.printf("Entered Month : %d : %s",month, year(month));

    }

    public static String year(int month){
        String output = switch (month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month number!";
        };
            return output;
    }

}


