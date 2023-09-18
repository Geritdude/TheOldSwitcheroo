import java.util.Scanner;
import java.util.Random;

public class TheOldSwitccheroo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random myRandom = new Random();
		int randomNumber;
		
		System.out.println("Type your question, my child: ");
		keyboard.nextLine();
		
		randomNumber = myRandom.nextInt(10)+1;
		
		switch (randomNumber){
		case 1: 
			System.out.println("Yes, isn't it obvious.");
			break;
			
		case 2:
			System.out.println("No, and don't ask again.");
			break;
			
		case 3: 
			System.out.print("Yessir, yessir!");
			System.out.println(" Three bags full");
			break;
			
		case 4: 
			System.out.print("What part of 'no'");
			System.out.println(" don't you understand?");
			break;
			
		case 5:
			System.out.println("No chance, Lance.");
			break;
		
		case 6:
			System.out.println("Sure, whatever.");
			break;
			
		case 7:
			System.out.print("Yes, but only if");
			System.out.println(" you're nice to me.");
			break;
		
		case 8:
			System.out.println("Yes (as if I care).");
			break;
			
		case 9:
			System.out.print("No, not until");
			System.out.println(" hell freezes over.");
			break;
			
		case 10:
			System.out.print("No, not until");
			System.out.println("Cromwell seizes Dover.");
			break;
			
		default: 
			System.out.print("You think you have");
			System.out.print(" problems?");
			System.out.print(" My random number");
			System.out.println(" generator is broken.");
			break;
		}
		
		System.out.println("Goodbye!");
		
		keyboard.close();
		
	}
}
