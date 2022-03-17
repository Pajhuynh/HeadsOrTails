import java.util.Scanner;

public class roughDraft2 {

	public static void main(String[] args) {
		System.out.println("-------");
		int correctCount = 0;
		int coinFlip = (int) (Math.random() * 2);

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number of guesses.");
		int numOfFlips = input.nextInt();

		for (int i = 0; i < numOfFlips; i++) {
			System.out.println("Enter '0' for heads or '1' for tails.");
			int playerInput = input.nextInt();

			if (playerInput == 0 || playerInput == 1) {
				if (playerInput == coinFlip) {
					correctCount++;
				}
				if (playerInput == 0) {
					System.out.println("heads");
				}
				if (playerInput == 1) {
					System.out.println("tails");
				}

				{

				}

			} else {
				System.out.println("you have entered an incorrect value.");
			}
		}
		System.out.println("correct count is : " + correctCount);
		int correctGuessPercent = (correctCount/numOfFlips)*100;
		System.out.println("correct Percent is : " + correctGuessPercent);

	}

}
