import java.util.Scanner;

class pyramidPattern {

    static void main(String[] args) {
        System.out.println("Printing Pyramid Patterns");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height of the pattern:");
        int rows = input.nextInt();
        input.close();
        rightHalfPyramid(rows);
        System.out.println();
        reverseRightHalfPyramid(rows);
        leftHalfPyramid(rows);
    }

    public static void rightHalfPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {       // Handles rows (1 to 5)
            for (int j = 1; j <= i; j++) {     // Prints stars equal to current row index
                System.out.print("* ");
            }
            System.out.println();              // Drops to the next line
        }
    }

    public static void reverseRightHalfPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {       // Outer loop counts backwards (5 down to 1)
            for (int j = 1; j <= i; j++) {     // Prints stars up to the current value of i
                System.out.print("* ");
            }
            System.out.println();              // Drops to the next line
        }
    }

    public static void leftHalfPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {

            // Inner Loop A: Prints the empty leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Use 2 spaces to match the visual width of "* "
            }

            // Inner Loop B: Prints the actual stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();              // Drops to the next line
        }
    }

}
