package Function;

public class primeNumberFunc {

    public static boolean isPrime(int n) {

        // Corner cases

        if (n == 2) {
            return true;
        }

        // for (int i = 2; i<=n-1; i++){
        //     if (n % i == 0){
        //         return false;
        //     }
        // }
        // return true;

        for (int i = 2; i<=Math.sqrt(n); i++){ //check for only small ^/n 
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }
}
