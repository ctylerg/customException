public class InvalidTestScore extends Exception{

  //no args constructor
  public InvalidTestScore(){
    super("Not a valid score.");
  }

    //args constructor
  public InvalidTestScore (int element, double score){
    super("You have an invalid score with Test: " + (element + 1) + " Score: " + score);
  }

}
