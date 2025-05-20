package Function;

import java.util.Scanner;

public class sumOfDigit {
    public static int sumOfInt(int num) {
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;

        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Integer/Number: ");
        int num = sc.nextInt();

        System.err.println("The sum is " + sumOfInt(num));

        sc.close();
    }

}
