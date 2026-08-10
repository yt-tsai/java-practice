package p09_exception_handling;

public class AgeValidationExample {

    public static void main(String[] args) {

        int age = -20;

        try {

            validateAge(age);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }

        System.out.println("Program continues.");

    }

    public static void validateAge(int age) throws IllegalArgumentException {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }

        System.out.println("Age: " + age);
    }

}