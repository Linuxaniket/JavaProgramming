package Function;

import java.util.Scanner;

public class palindromeChecker {
    public static boolean isPalindrome(int num) {
        int original = num; // to store original number
        int rev = 0;

        while (num > 0) {
            int remainder = num % 10; // get the lastdigit
            rev = rev * 10 + remainder; // store number in reverse
            num /= 10; // remove lastdigit
        }
        return original == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is not Palindrome");
        }

        sc.close();
    }

}
