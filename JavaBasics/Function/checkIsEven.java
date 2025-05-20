package Function;

import java.util.Scanner;

public class checkIsEven {

    public static boolean isEven(int a) {
        if (a == 0) {
            return true;
        }

        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        if (isEven(a)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        sc.close();

    }
}
