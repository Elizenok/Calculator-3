import java.io.IOException;
import java.util.Scanner;

public class Caclculos {



    public static void main(String[] args) throws IOException {
        Scanner inputStringValue = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String inputString = inputStringValue.nextLine();
        String[] calcInputString = calc(inputString);

    }

    public static String[] calc(String inputString) throws IOException {

        String[] calcInputString = inputString.split(" ");
        if (inputString.isEmpty()) {
            throw new IOException("Выражение не введено");
        }
        if (calcInputString.length != 3) {
            throw new IOException("Неверный формат ввода данных. Введите выражение, разделяя каждый символ _пробелом");
        }
        else {
            int value1 = 0;
            int value2 = 0;
            int result = 0;
            String operation = calcInputString[1];
            try {
                value1 = Integer.parseInt(calcInputString[0]);
                value2 = Integer.parseInt(calcInputString[2]);
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат числа");
            }
            if (value1 < 1 || value1 > 10) {
                throw new IOException("number error 1");
            }

            if (value2 < 1 || value2 > 10) {
                throw new IOException("number error 2");

            }
            if (operation.equals("+")) {
                result = value1 + value2;
            } else if (operation.equals("-")) {
                result = value1 - value2;
            } else if (operation.equals("*")) {
                result = value1 * value2;
            } else if (operation.equals("/")) {
                result = value1 / value2;
            } else {
                throw new IOException(" operator error");

            }
            System.out.println("= " + result);
            return calcInputString;
        }
    }
}
