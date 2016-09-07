public class RockPaperScissors {

  public String displayResult(String playerOneEntry, String playerTwoEntry) {
    String result = "";
    if (playerOneEntry.equals(playerTwoEntry)) {
      result = "Tie";
    } else {
      result = "Uh oh";
    }
    return result;
  }
}
