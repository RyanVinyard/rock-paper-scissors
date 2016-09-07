import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void displayResult_displayATie_String() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Tie";
    assertEquals(expected, testRockPaperScissors.displayResult("rock", "rock"));
  }
}
