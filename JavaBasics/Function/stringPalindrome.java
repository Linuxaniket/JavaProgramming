package Function;

import java.util.Scanner;

public class stringPalindrome {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1; //start from 0 index
 
        while (left < right) { //left index 0 > right 4  True
            if (str.charAt(left) != str.charAt(right)) { // CharAt() compare the left and right characteres
                return false;// not a palindrome
            }
            left++; //increase index by 1 
            right--; //decrease index by 1 

        }
        return true; // it is a palindorme
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String ch = sc.nextLine();

        if (isPalindrome(ch)) {
            System.out.println(ch + " is a Palindrome");
        } else {
            System.out.println(ch + " is not a Palindrome");
        }
        sc.close();
    }
}
