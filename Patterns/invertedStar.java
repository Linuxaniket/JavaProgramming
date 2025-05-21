package Patterns;

public class invertedStar {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            // for (int j = i; j<=5; j++){ // It will print the no of star from i to n 
            for (int j = 1; j<=5-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}



