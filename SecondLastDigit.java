import java.util.Scanner;
public class SecondLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int secondLastDigit = (number / 10) % 10;
        System.out.println("The second last digit of " + number + " is: " + secondLastDigit);
    }
}