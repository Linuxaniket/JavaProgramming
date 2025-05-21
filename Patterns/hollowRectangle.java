package Patterns;

public class hollowRectangle {
    public static void hollow_Rectangle(int totalRows, int totalCols){
        //outer loop for print rows 
        for (int i = 1; i<=totalRows; i++){
            //inner loop for print cols
            for (int j = 1; j<=totalCols; j++){
                //Condition to check for boundary row & col
                if (i == 1 || totalRows == i || j == 1 || totalCols == j){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_Rectangle(4, 5);
    }
}
