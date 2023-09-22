import java.util.Scanner;

public class Opgave4 {
    public static void main(String[] args) {

        // Opgave 6.4 fået hjælp fra github

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer");
        int number = input.nextInt();

        reverse(number);
    }

    public static void reverse(int number) {
        while (number > 0) {
            System.out.println(number%10);
            number /= 10;
        }
        System.out.println();
    }
}
