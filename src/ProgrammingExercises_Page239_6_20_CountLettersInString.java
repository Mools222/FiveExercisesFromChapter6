import java.util.Scanner;

public class ProgrammingExercises_Page239_6_20_CountLettersInString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.println("The number of letters in the string: " + countLetters(text));
    }

    public static int countLetters(String s) {
        return s.length();
    }
}
