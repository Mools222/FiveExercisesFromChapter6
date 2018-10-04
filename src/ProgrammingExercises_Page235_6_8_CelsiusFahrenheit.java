public class ProgrammingExercises_Page235_6_8_CelsiusFahrenheit {
    public static void main(String[] args) {

        System.out.println("Celsius\t\tFahrenheit\t\t|\t\tFahrenheit\t\tCelsius");
        System.out.println("--------------------------------------------------------------");
//        System.out.println("______________________________________________________________");

        for (double i = 9; i >= 0; i--) {
//            System.out.println((i + 31) + "\t\t" + celsiusToFahrenheit(i + 31) + "\t\t|\t\t" + ((i * 10) + 30) + "\t\t" + fahrenheitToCelsius((i * 10) + 30));

            System.out.printf("%1.1f%s%1.1f%s%1.1f%s%1.2f\n", (i + 31), "\t\t", celsiusToFahrenheit(i + 31), "\t\t\t|\t\t", ((i * 10) + 30), "\t\t\t", fahrenheitToCelsius((i * 10) + 30));

        }
        
    }

    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;

    }
    /** Convert from Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double fahrenheit) {

        return (5.0 / 9) * (fahrenheit - 32);

    }

}
