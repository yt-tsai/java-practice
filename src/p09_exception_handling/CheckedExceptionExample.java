package p09_exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader("test.txt");

        } catch (FileNotFoundException e) {

            System.out.println("File cannot be found !!");
        }

        System.out.println("Program continues.");

    }
}