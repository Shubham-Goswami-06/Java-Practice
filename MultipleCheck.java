//Is N an exact multiple of M?
import java.util.Scanner;
public class MultipleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        if(N % M == 0){
            System.out.println(N + " is an exact multiple of " + M);
        }
        else{
            System.out.println(N + " is not an exact multiple of " + M);
        }
    }
}
