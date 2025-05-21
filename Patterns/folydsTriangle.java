package Patterns;

public class folydsTriangle {
    public static void folyd(int n){
        int counter =  1;
        // outer loop for rows 
        for (int i = 1; i<=n; i++){
            //inner loop for counter to print 
            for (int j = 1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;//after print increment it 
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        folyd(5);
    }
    
}
