import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    final String RED = "\033[0;31m";
    final String BLUE = "\033[0;34m";

    int counter = 0;
    int userNumber = 0;
    int randomNumber = (int) (Math.random() * 100) + 1;

    Scanner scanner = new Scanner(System.in);
    System.out.println(BLUE + "\nI have chosen an integer between 1 and 100.");
    System.out.print("Try to guess it: ");
    do {
      try {
        userNumber = Integer.parseInt(scanner.nextLine());
        counter++;
      } catch (Exception e) {
        System.out.println(RED + "Invalid input. " + e.getMessage());
        continue;
      }

      if (userNumber > randomNumber) {
        System.out.println("Your number is too high. Try a lower number!");
      } else if (userNumber < randomNumber) {
        System.out.println("Your guess is too low. Try a higher number!");
      } else {
        System.out.printf("%n%sCongratulations!%s%nYou've guessed the number correctly with %d guess(es).%n", RED, BLUE, counter);
      }
    } while (randomNumber != userNumber);
    scanner.close();
  }

}
