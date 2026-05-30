import java.util.Scanner;

class compoundinterest {

    static void main(String[] args) {
        System.out.println("This is a program to calculate Compound interest:");
        Scanner input = new Scanner(System.in);
        System.out.println("Provide the Principal amount in ₹:");
        long pri = input.nextLong();
        System.out.println("What was the rate of interest ? :");
        long rate = input.nextLong();
        System.out.println("And, for what time was the loan for ? :");
        long time = input.nextLong();

        System.out.printf("The Compound Interest for the given time is : ₹ %d%n", ci(pri,rate,time));

    }

    public static long ci(long pri, long rate, long time){

        double totalAmount = pri * Math.pow(1+(rate/100.0), time);
        long cInterest =  (long)totalAmount - pri;
        return cInterest;

    }

}
