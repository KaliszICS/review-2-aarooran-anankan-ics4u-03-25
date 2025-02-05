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

		System.out.print("In: ");
		String answer = in.nextLine();
		System.out.println(answer);

	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);

		System.out.print("In: ");
		int one = in.nextInt();
		in.nextLine();
		System.out.print("In: ");
		int two = in.nextInt();
		in.nextLine();
		System.out.println(one/two);
		System.out.println(one%two);

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

		System.out.print("In (int): ");
		int four = in.nextInt();
		in.nextLine();
		System.out.println(four + " times 5 is: " + (four * 5));

	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);

		System.out.print("Is pizza a sandwich? In (boolean):");
		boolean five = in.nextBoolean();
		in.nextLine();
		System.out.println(five + " is a boolean, and also your answer");

	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);

		System.out.print("In (double): ");
		double six = in.nextDouble();
		in.nextLine();
		System.out.println(six + " minus 3.2 is: " + (six - 3.2));
	}

}
