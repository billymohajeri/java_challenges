import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final String RED = "\033[0;31m";
    final String BLUE = "\033[0;34m";

    System.out.println(BLUE + "Enter two numbers:");

    System.out.print("1st number: ");
    Scanner scanner = new Scanner(System.in);
    double firstNumber = Double.parseDouble(scanner.nextLine());

    System.out.print("2nd number: ");
    double secondNumber = Double.parseDouble(scanner.nextLine());
    String operation;
    do {
      System.out.printf("%nChoose an operation (Enter 1 to 4 or Q to quit):%n");
      System.out.printf("1. Addition (+)%n2. Subtraction (-)%n3. Multiplication (*)%n4. Division (÷)%n");
      operation = scanner.nextLine();

      switch (operation) {
        case "1" -> System.out.printf("%n%.2f + %.2f = %.2f%n", firstNumber, secondNumber, firstNumber + secondNumber);
        case "2" -> System.out.printf("%n%.2f - %.2f = %.2f%n", firstNumber, secondNumber, firstNumber - secondNumber);
        case "3" -> System.out.printf("%n%.2f x %.2f = %.2f%n", firstNumber, secondNumber, firstNumber * secondNumber);
        case "4" -> {
          if (secondNumber == 0) System.out.println(RED + "Error! Can't divide by zero." + BLUE);
          else System.out.printf("%n%.2f ÷ %.2f = %.2f%n", firstNumber, secondNumber, firstNumber / secondNumber);
        }
        case "q", "Q" -> System.out.printf("%nExiting the program. Thanks!%n");
        default -> System.out.println(RED + "Invalid input! Please enter 1 to 4 or Q to quit." + BLUE);
      }
    } while (!operation.equalsIgnoreCase("q"));
    scanner.close();
  }
}