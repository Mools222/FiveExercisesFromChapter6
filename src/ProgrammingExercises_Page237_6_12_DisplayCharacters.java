public class ProgrammingExercises_Page237_6_12_DisplayCharacters {
    public static void main(String[] args) {

        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {

        int counter = 0;

        for (int i = ch1; i <= ch2; i++) {
            System.out.print((char)i + " ");

            ++counter;

            if (counter % numberPerLine == 0)
                System.out.print("\n");

        }

    }
}
