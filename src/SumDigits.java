public class SumDigits {

    public static int sumDigitsInTheNumber(int number){
        if((number < 10) || (number < 0)){
            return -1;
        }
        int sumDigits = 0;

        while(number != 0){
            // Find out the last digit in the number
            int leastSignDigit = number % 10;

            // The remaining digits
            number /= 10;

            // Calculate the sum of all digits in the number
            sumDigits += leastSignDigit;

        }

        return sumDigits;

    }
}
