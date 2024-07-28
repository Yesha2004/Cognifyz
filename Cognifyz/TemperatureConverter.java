import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Accept temperature input
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        // Step 3: Choose the conversion direction
        System.out.print("Convert to (C)elsius or (F)ahrenheit? Enter C or F: ");
        char conversion = scanner.next().charAt(0);

        double convertedTemperature = 0.0;
        if (conversion == 'C' || conversion == 'c') {
            // Step 2: Implement logic for temperature conversion to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println(temperature + " Fahrenheit is " + convertedTemperature + " Celsius.");
        } else if (conversion == 'F' || conversion == 'f') {
            // Step 2: Implement logic for temperature conversion to Fahrenheit
            convertedTemperature = temperature * 9 / 5 + 32;
            System.out.println(temperature + " Celsius is " + convertedTemperature + " Fahrenheit.");
        } else {
            System.out.println("Invalid input! Please enter 'C' or 'F'.");
        }

        scanner.close();
    }
}
