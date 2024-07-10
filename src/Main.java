import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final String YELLOW = "\033[0;33m";

    System.out.println(YELLOW + "Enter two numbers:");

    System.out.print("1st numbers: ");
    Scanner scanner = new Scanner(System.in);
    double firstNumber = Double.parseDouble(scanner.nextLine());

    System.out.print("2nd numbers: ");
    double secondNumber = Double.parseDouble(scanner.nextLine());

    System.out.printf("%nChoose an operation (Enter 1 to 4):%n");
    System.out.printf("1. Addition (+)%n2. Subtraction (-)%n3. Multiplication (*)%n4. division (÷)%n");
    String operation = scanner.nextLine();

    switch (operation) {
      case "1" -> System.out.printf("%.2f + %.2f = %.2f", firstNumber, secondNumber, firstNumber + secondNumber);
      case "2" -> System.out.printf("%.2f - %.2f = %.2f", firstNumber, secondNumber, firstNumber - secondNumber);
      case "3" -> System.out.printf("%.2f x %.2f = %.2f", firstNumber, secondNumber, firstNumber * secondNumber);
      case "4" -> System.out.printf("%.2f ÷ %.2f = %.2f", firstNumber, secondNumber, firstNumber / secondNumber);
    }
  }
}