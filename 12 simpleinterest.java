import java.util.Scanner;

class simpleinterest {

    static void main(String[] args) {

        System.out.println("This is a program to calculate Simple interest:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal amount in ₹:");
        long prin = input.nextLong();
        System.out.println("What was the rate of interest ? :");
        long rate = input.nextLong();
        System.out.println("And, for what time the loan was for ? :");
        long time = input.nextLong();

        System.out.printf("The calculated Simple interest for the given time period was : ₹%d%n", si(prin ,rate ,time));

    }

    public static long si(long prin, long rate, long time){
        long si = (prin * rate * time) / 100;
        return si;
    }

}
