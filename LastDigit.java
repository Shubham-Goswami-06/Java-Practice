import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int lastDigit = number % 10;
        System.out.println("The last digit of " + number + " is: " + lastDigit);
    }
}
