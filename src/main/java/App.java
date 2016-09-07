import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("It's Rock Paper Scissors time!");
    System.out.println("Player 1, tell me your throw!");
    String playerOneEntry = myConsole.readLine();
    String separation = "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" + System.lineSeparator() + "|" ;
    System.out.println(separation);
    System.out.println("Player 2, tell me your throw!");
    String playerTwoEntry = myConsole.readLine();
    RockPaperScissors rockPaperScissors = new RockPaperScissors();
    String rockPaperScissorsResult = rockPaperScissors.displayResult(playerOneEntry, playerTwoEntry);
    System.out.println("Player 1 throws " + playerOneEntry + "!");
    System.out.println("Player 2 throws " + playerTwoEntry + "!");
    System.out.println(rockPaperScissorsResult);


  }
}
