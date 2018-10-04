import java.util.Scanner;

public class ProgrammingExercises_Page234_6_2_SumDigitsOfInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long integer = input.nextLong();

        System.out.println("The sum of all its digits: " + sumDigits(integer));

    }

    public static int sumDigits(long n) {

        long getDigit;
        long removeDigit;
        int sum = 0;

        while (n > 0) {
            getDigit = n % 10;
            removeDigit = n / 10;
            n = removeDigit;
            sum += getDigit;
        }

        return sum;
    }


}
