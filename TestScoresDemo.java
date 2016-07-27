//Java app the customizes an error
import java.util.Scanner;

public class TestScoresDemo {
  public static void main(String[] args){



    try{
    int numTest;
    double[] tests;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How many test do you have?");
    numTest = keyboard.nextInt();

    tests = new double[numTest];
    for (int i = 0; i < tests.length; i++){
      System.out.println("Enter test score " + (i + 1) + " : ");
      tests[i] = keyboard.nextDouble();
    }
    TestScores ttt = new TestScores(tests);
    System.out.println("the avg is " + ttt.getAvg());
    }
    catch(InvalidTestScore e){
      System.out.println("An invalid test score was found.\n" + e.getMessage());
    }

  }

}
