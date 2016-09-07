import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void displayResult_displayATie_String() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Tie";
    assertEquals(expected, testRockPaperScissors.displayResult("rock", "rock"));
  }

  @Test
  public void displayResult_displayPlayerOneVictory_String() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Victory for Player 1";
    assertEquals(expected, testRockPaperScissors.displayResult("rock", "scissors"));
  }

  @Test
  public void displayResult_displayPlayerTwoVictory_String() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Victory for Player 2";
    assertEquals(expected, testRockPaperScissors.displayResult("paper", "scissors"));
  }

  
}
