public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Opgave 6.1 fået hjælp fra github
        for (int i = 1; i<=100; i++) {
            System.out.printf("%7d ", getPentagonalNumber(i));
            if (i % 10 == 0)
                System.out.println();
        }

    }

    public static int getPentagonalNumber(int n) {
        return (n *(3 * n - 1)) /2;
    }
}