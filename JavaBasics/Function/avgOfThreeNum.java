package Function;

import java.util.Scanner;

public class avgOfThreeNum {
    public static int avg(int a, int b, int c){
        int avgOfNumber = (a + b + c) / 3;
        return avgOfNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st no: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd no: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd no: ");
        int c = sc.nextInt();

        System.out.println("The avg of 3 numbers are : " + avg(a, b, c));

        sc.close();
    }
    
}
