package Patterns;

public class butterfly {
    public static void Butterfly(int n) {
        // outer for loop for to print rows if 1st half
        for (int i = 1; i <= n; i++) {
            // inner for loop for star print (i)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // inner for loop for to print space 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // inner for loop for star print (i)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // outer for loop for 2nd half
        for (int i = n; i >= 1; i--) {
            // inner for loop for star print (i)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // inner for loop for to print space 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // inner for loop for star print (i)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Butterfly(10);
    }

}
