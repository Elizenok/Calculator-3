import java.io.IOException;
import java.util.Scanner;

public class Caclculos {
    public static void main(String[] args) throws IOException  {
        int value1 = 0;
        int value2 = 0;
        String operation = null;
        System.out.print("Введите выражение (через пробелы): ");
        Calculator calc = new Calculator();
        calc.calculate(value1,value2, operation);
    }
}

class Calculator {
    Scanner scanner = new Scanner(System.in);

    void calculate(int value1, int value2, String operation) throws IOException {

        value1 = scanner.nextInt();
        operation = scanner.next();
        value2 = scanner.nextInt();
        if (value1 < 1 || value1 > 10) {
            throw new IOException("number error 1");
        }
        if (value2 < 1 || value2 > 10) {
            throw new IOException("number error 2");

        }
        if (operation.equals("+")) {
            System.out.println(value1 + value2);
        }
        else if (operation.equals("-")) {
            System.out.println(value1 - value2);
        }
        else if (operation.equals("*")) {
            System.out.println(value1 * value2);
        }
        else if (operation.equals("/")) {
            System.out.println(value1 / value2);
        } else {
            throw new IOException(" operator error");

        }
    }

}

