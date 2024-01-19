package JavaIntern;
import java.util.Random;
import java.util.Scanner;

public class NumbGame {
	public static void main(String args[]) {
		PlayGame();
	}
	public static void PlayGame(){
		int LowerLimit = 1;
		int UpperLimit = 100;
		int AttemptsLimit = 10;
		int Score = 0;
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
	while(true) {
			int GeneratedNumber = random.nextInt(UpperLimit-LowerLimit+1)+LowerLimit;
			int Attempts = 0;
			
			System.out.printf("Guess The Number Between 1 to 100",LowerLimit,UpperLimit);
			
		while(Attempts < AttemptsLimit)	{
			System.out.print("\nEnter your guess :");
			int Guess = scanner.nextInt();
			
		if(Guess == GeneratedNumber) {
			Score++;
			System.out.printf("Congratulation! You guessed the correct number in %d Attempts.%n%n",Attempts+1);
			break;
		}
		else if(Guess < GeneratedNumber) {
			System.out.println("Too Low! Try again.");
		}
		else {
			System.out.println("Too High! Try again");
		}
		Attempts++;
		}
		if(Attempts == AttemptsLimit) {
			System.out.printf("%nGame over! The number I was thinking of was %d.%n%n",GeneratedNumber);
		}
		System.out.print("Do you want to play again? (yes/no):");
		String PlayAgain = scanner.next();
		
		if(!PlayAgain.equalsIgnoreCase("yes")) {
			break;
		}
	}
	  System.out.printf("%n Your final score is %d. Thanks for Playing!%n",Score);
	  scanner.close();
	}

}


