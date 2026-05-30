package programming_Challenges.challenge82;

import java.util.Arrays;

public class ArrayOperations {
   private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics{
        double mean (){
            double sum = 0;
            for (int number : numbers){
                sum += number;
            }return sum/numbers.length;
        }

        double median(){
            Arrays.sort(numbers);

            int length = numbers.length;
            if (length % 2 != 0) {
                return numbers[length / 2];
            }else{
                int mid1 = numbers[(length / 2) - 1];
                int mid2 = numbers[length / 2];
                return (mid1 + mid2) / 2.0;

            }
        }

    }

}
