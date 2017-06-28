import java.io.Console;
public class App {
    public static void main(String[] args) {
      Console myConsole = System.console();
      System.out.println("Enter a word");
      String stringUserInput = myConsole.readLine();
      String stringInputLowercase = stringUserInput.toLowerCase();

      ScrabbleScorer scrabblescore = new ScrabbleScorer();
      Integer intFinalScore = scrabblescore.calculateScore(stringInputLowercase);
      System.out.println("The final score is " + intFinalScore);
    }
}
