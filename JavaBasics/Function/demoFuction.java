package Function;

import java.util.Scanner;

public class demoFuction {

    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter value of num1: ");
        int a = sc.nextInt();
        System.out.print("Enter value of num2: ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum is :" + sum);

        sc.close();
    }
}
