package p09_exception_handling;

public class ArrayExceptionExample {

    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30 };

        try {
            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(e);
            System.out.println("Please check whether the array index is within the valid range.");
            e.printStackTrace();
        }

        System.out.println("Program continues.");

    }

}