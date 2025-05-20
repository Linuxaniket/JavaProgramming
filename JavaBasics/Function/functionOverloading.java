package Function;

public class functionOverloading {
    static class Calculator {

        // Method to add two integers
        int add(int a, int b) {
            return a + b;
        }

        // Overloaded method to add three integers
        int add(int a, int b, int c) {
            return a + b + c;
        }

        // Overloaded method to add two doubles
        double add(double a, double b) {
            return a + b;
        }

        // Overloaded method to add a string and an integer
        String add(String a, int b) {
            return a + b; // String concatenation
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(10, 20)); // 30
        System.out.println(calc.add(10, 20, 30)); // 60
        System.out.println(calc.add(5.5, 4.5)); // 10.0
        System.out.println(calc.add("Result: ", 100)); // Result: 100
    }

}
