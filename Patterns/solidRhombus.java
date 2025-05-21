package Patterns;

public class solidRhombus {
    public static void solid_Rhombus(int n) {
        // outer for loop for rows
        for (int i = 1; i <= n; i++) {
            // inner loop for spaces (n-i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop for stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String args []){
        solid_Rhombus(7);
    }

}
