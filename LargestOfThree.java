import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));

        System.out.println("Largest Number = " + largest);

        sc.close();
    }
}
