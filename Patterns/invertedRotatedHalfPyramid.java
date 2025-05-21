package Patterns;

public class invertedRotatedHalfPyramid {

    public static void invertedRotatePyramid(int totalRows) {
        // outer loop for rows
        for (int i = 1; i <= totalRows; i++) {
            // inner loop for to print space
            for (int j = 1; j <= totalRows - i; j++) {
                System.out.print(" ");
            }
            // inner loop for to print star
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void invertedRotatedHalfPyramidNumbers(int totalRows){
        //outer loop for rows 
        for (int i = 1; i<=totalRows; i++){
            //inner loop for numbers
            for (int j= 1; j<=totalRows-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // invertedRotatePyramid(4);
        invertedRotatedHalfPyramidNumbers(5);
    }
}
