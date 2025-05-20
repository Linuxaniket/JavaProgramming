package Function;

import java.util.Scanner;

public class productOfNumber {
    public static int calProduct(int num1, int num2){
        int product = num1 * num2;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();

        int productoftwo = calProduct(a, b);
        System.out.println("Product of two numbers: "+productoftwo);
    }
    
}
