package snippet;

import java.util.Scanner;

public class Roughdraft3 {

	public static void main(String[] args) {
		 System.out.println("-----");
	      int numberOfFlips;
	      Scanner input = new Scanner(System.in);

	      System.out.println("Enter your number of guesses");
	      numberOfFlips = input.nextInt();

	      int correctCount = 0;

	      for(int i=0;i<numberOfFlips;i++)
	      {
	          System.out.print("Enter heads or tails ");
	          String headsOrTailsGuess = input.next();

	          int toss = (int)(Math.random()*2);

	          if(headsOrTailsGuess.equals("heads") && toss ==1)
	          correctCount ++ ;

	          if(headsOrTailsGuess.equals("tails") && toss ==0)
	          correctCount ++;

	          System.out.println("User's Guess is "+headsOrTailsGuess);
	          if(toss==0)
	          System.out.println("System's guess is tails");
	          else
	          System.out.println("System's guess is heads");

	      }

	      System.out.println("Total number of correct guesses are "+correctCount);
	      double percentage_correct_guess = (correctCount*100)/numberOfFlips;

	      System.out.println("Percentage of correct guess is "+percentage_correct_guess);

	}

}
