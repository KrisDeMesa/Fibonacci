import java.util.Scanner;

public class Fibonacci {
	// Create a method to calculate a given input
	public static int doCalc(int n) {
		// Declare vars for 1st, 2nd number and number
		int firstNum = 0;
		int secondNum = 1;
		int number = 0;
		// Print out 0 1
		System.out.print("0 1 ");

		// Create a while that runs while number < input
		while (number < n) {
			// Update number with sum of 1st and 2nd num
			number = firstNum + secondNum;
			// Create a restriction that ends loop if number >= n
			if (number > n) {
				break;
			}
			// Prints number series
			System.out.print(number + " ");
			// Update and move values for next iteration
			firstNum = secondNum;
			secondNum = number;
		}
		// Returns value after calculations is over
		return n;
	}

	public static void main(String[] args) {
		// Import Scanner
		Scanner userInput = new Scanner(System.in);
		// Ask user for input
		System.out.print("Please enter a number: ");
		String numberInput = userInput.nextLine();
		// Save input as a int var
		int number = Integer.parseInt(numberInput);
		doCalc(number);














	}

}
