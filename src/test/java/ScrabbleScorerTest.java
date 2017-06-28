import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleScorerTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 1;
    assertEquals (expected, testScrabble.calculateScore("a"));
  }


  @Test
  public void calculateScore_returnsScoreForSingleLetter_2() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 2;
    assertEquals (expected, testScrabble.calculateScore("d"));
  }

  @Test
  public void calculateScore_returnsScoreForTwoLetters_2() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 2;
    assertEquals (expected, testScrabble.calculateScore("on"));
  }

  @Test
  public void calculateScore_returnsScoreForAnyWord_33() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 33;
    assertEquals (expected, testScrabble.calculateScore("agpvkxz"));
  }

}
