package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){  // Use for the how many line in the pattern 
            for (int j = 1; j<=i; j++){ // this for how many star should be in their
                System.out.print("*"); // this to print the star
            }
            System.out.println();
        }
        
    }
}
