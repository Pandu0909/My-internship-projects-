package javaprograms;

import java.util.Scanner;

public class Guessingnumber {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int secreteNumber=(int)(Math.random()*100)+1;
		int attempts=0;
		int guess;
		System.out.println("welcome to number guessing Game");
		System.out.println("Take a guess:");
		guess=scanner.nextInt();
			attempts++;
		if(guess<secreteNumber) {
			System.out.println("Too low!Try again");
			}
		else if(guess>secreteNumber) {
			System.out.println("Too high!Try agin");
		}
		else {
			System.out.println("Congratulations!you guessed the number in"+attempts+"attempts");
		}

	while(guess!=secreteNumber);
	scanner.close();

}
}
