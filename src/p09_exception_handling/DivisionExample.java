package p09_exception_handling;

public class DivisionExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println(e);
            System.out.println("Arithmetic error. The denominator cannot be zero.");
            e.printStackTrace();
        }

        System.out.println("Program continues.");

    }
}