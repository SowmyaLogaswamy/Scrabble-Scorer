//mport java.util.ArrayList;
//import java.util.List;

public class ScrabbleScorer {
  //public String mWord;

  // public ScrabbleScorer (String word) {
  //   mWord = word;
  // }

  public Integer calculateScore(String word) {
    Integer score = 0;
    for (char ch: word.toCharArray()) {
      if ((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') || (ch=='l') || (ch=='n') || (ch=='r') || (ch=='t')|| (ch=='s')) {
        score += 1;
      } else if ((ch=='d') || (ch=='g')) {
          score +=2;
      } else if ((ch=='b') || (ch=='c') || (ch=='m') || (ch=='p')) {
        score += 3;
      } else if ((ch=='f') || (ch=='h') || (ch=='v') || (ch=='w') || (ch=='y')) {
        score += 4;
      } else if (ch=='k') {
        score +=5;
      } else if ((ch=='j') || (ch=='x')) {
        score += 8;
      } else  {
        score += 10;
      }
    }
    return score;

    // List<ScrabbleScorer> result = new ArrayList<ScrabbleScorer>();
    // for (String individualLetter: word) {
    //   if (String.individualLetter.equals('a')) {
    //     result = 1;
    //     return result;
    //   }
    // }
    // ScrabbleScorer result = new ScrabbleScorer();
    // List<ScrabbleScorer> result = new ArrayList<ScrabbleScorer>();
    // for (String individualLetter: word) {
    //   if {
    //
    //   }
    // }
    // return result;
  }
}
