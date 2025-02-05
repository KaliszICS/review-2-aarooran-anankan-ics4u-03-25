import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);

		System.out.print("In (word): ");
		String answer = in.nextLine();
		System.out.println("You inputted: " + answer);

	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);

		System.out.print("In (int 1): ");
		int one = in.nextInt();
		in.nextLine();
		System.out.print("In (int 2): ");
		int two = in.nextInt();
		in.nextLine();
		System.out.println("The quotient rounded down is: " + one/two);
		System.out.println("The remainder is: " + one%two);

	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);

		System.out.print("In (string): ");
		String string = in.nextLine();
		System.out.println("\"" + string + "\"" + " was the text you wrote");
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);

		
	}

	public static void q5() {
		//Write question 5 code here
		
	}

	public static void q6() {
		//Write question 6 code here
		
	}

}
