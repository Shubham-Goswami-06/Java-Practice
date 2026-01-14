import java.util.Scanner;

public class EvenCheck {

	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		String output = (input % 2 == 0) ? "Yes, input " + input + " is even." : "No, input " + input + " is not even.";
		System.out.print(output);
	}
}