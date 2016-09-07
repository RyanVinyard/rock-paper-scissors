public class RockPaperScissors {

  public String displayResult(String playerOneEntry, String playerTwoEntry) {
    String result = "";
    if (playerOneEntry.equals(playerTwoEntry)) {
      result = "Tie";
    } else if ((playerOneEntry.equals("rock") && playerTwoEntry.equals("scissors")) || (playerOneEntry.equals("scissors") && playerTwoEntry.equals("paper")) || (playerOneEntry.equals("paper") && playerTwoEntry.equals("rock"))) {
      result = "Victory for Player 1";
    } else if ((playerOneEntry.equals("rock") && playerTwoEntry.equals("paper")) || (playerOneEntry.equals("scissors") && playerTwoEntry.equals("rock")) || (playerOneEntry.equals("paper") && playerTwoEntry.equals("scissors"))) {
      result = "Victory for Player 2";
    }
    return result;
  }
}
