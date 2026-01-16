import java.util.Scanner;

public class OddCheck {

	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		String output = (input % 2 != 0) ? "Yes, input " + input + " is odd." : "No, input " + input + " is not odd.";
		System.out.print(output);
	}
}