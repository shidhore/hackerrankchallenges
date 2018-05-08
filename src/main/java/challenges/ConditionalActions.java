/*
 * Hackerrank Challenge
	Task
	Given an integer, n, perform the following conditional actions:
	
	If n is odd, print Weird
	If n is even and in the inclusive range of 2 to 5, print Not Weird
	If n is even and in the inclusive range of 6 to 20, print Weird
	If n is even and greater than 20, print Not Weird
	
	Input Format
	A single line containing a positive integer, n.
	
	Constraints
	1 <= n <= 100
	
	Output Format
	Print Weird if the number is weird; otherwise, print Not Weird.
	
	Sample Input 0
	3
	Sample Output 0
	Weird
	
	Sample Input 1
	24
	Sample Output 1
	Not Weird
 */
package challenges;

import java.util.Scanner;
import java.util.function.Predicate;

public class ConditionalActions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nextInt = scan.nextInt();
		scan.close();
		String answer = "";

		Predicate<Integer> oddNumber = i -> i % 2 == 1;
		Predicate<Integer> evenNumberBetween2And5 = i -> (2 <= i && i <= 5);
		Predicate<Integer> evenNumberBetween6And20 = i -> (6 <= i && i <= 20);
		Predicate<Integer> evenNumberGreaterThan20 = i -> (i > 20);
		
		if (oddNumber.test(nextInt)) {
			answer = "Weird";
		} else {
			if (evenNumberBetween2And5.test(nextInt)) {
				answer = "Not Weird";
			} else if (evenNumberBetween6And20.test(nextInt)) {
				answer = "Weird";
			} else if (evenNumberGreaterThan20.test(nextInt)) {
				answer = "Not Weird";
			}
		}
		
		System.out.println(answer);
	}

}
