public class TestScores{
    private double[] score; //for the test score

  public TestScores(double[] scoreArray) throws InvalidTestScore{
    score = new double[scoreArray.length];  //create an array to hold the scores passed through as args

    //copy the args into an array and check for validity
    for (int i = 0; i < scoreArray.length; i++){
      if (scoreArray[i] < 0 || scoreArray[i] > 100)
      throw new InvalidTestScore(i, scoreArray[i]);
      else
        score[i] = scoreArray[i];
    }
  }


  public double getAvg(){
  double total = 0; //set accumulator to 0
  //loop though array and add element to total
  for (int i = 0; i <score.length; i++)
  total += score[i];

  return (total/score.length);
  }
}
