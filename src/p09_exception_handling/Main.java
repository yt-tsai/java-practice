package p09_exception_handling;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int[] numbers = { 10, 20, 30 };

        String line = "------------------------------";

        try {
            System.out.println(a / b);
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {

            System.out.println(line);
            System.out.println(e);
            System.out.println("Arithmetic error. The denominator cannot be zero.");
            e.printStackTrace();
            System.out.println("Arithmetic exception was handled.");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(line);
            System.out.println(e);
            System.out.println("Please check whether the array index is within the valid range.");
            e.printStackTrace();
            System.out.println("Array index exception was handled.");

        } finally {
            System.out.println("Finally block is executed.");
        }

        System.out.println("Program continues.");
    }
}