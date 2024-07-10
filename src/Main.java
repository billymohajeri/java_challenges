import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Enter two numbers:");
    System.out.print("1st numbers: ");
    Scanner scanner = new Scanner(System.in);
    double firstNumber = Double.parseDouble(scanner.nextLine());
    System.out.print("2nd numbers: ");
    double secondNumber = Double.parseDouble(scanner.nextLine());
    System.out.println(firstNumber + secondNumber);
  }
}