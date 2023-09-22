import java.util.Scanner;

public class Opgave3 {
    public static void main(String[] args) {

        // Opgave 6.3 fået hjælp fra github

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer");
        int number = input.nextInt();

        System.out.printf("%d reversed is %d%n", number, reverse(number));
        System.out.printf("%d is %s palindrome%n",number,isPalindrome(number) ? "a" : "not a");

        //System.out.println(reverse(456));
        //System.out.println(isPalindrome(456));
    }

    public static int reverse(int number) {
        String reversedNumber = "";
        while (number != 0) {
            reversedNumber += number % 10;
            number = number / 10;
        }
        return Integer.parseInt(reversedNumber);
    }

    public static boolean isPalindrome(int number) {
        if (number == reverse(number))
            return true;
        return false;
    }
}
