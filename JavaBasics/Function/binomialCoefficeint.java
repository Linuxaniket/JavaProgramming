package Function;

public class binomialCoefficeint {

    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int nCr(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binocoeff = fact_n / (fact_r * fact_nmr);
        return binocoeff;
    }

    public static void main(String[] args) {
        System.out.println(nCr(5, 3));
    }

}