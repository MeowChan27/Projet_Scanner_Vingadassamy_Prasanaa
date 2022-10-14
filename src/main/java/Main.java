package main.java;
import java.util.Objects;

public class Main {
public static void main(String[] args) {
        /*
        SafeScanner safeScanner = new SafeScanner(
                Objects.requireNonNull(SafeScanner.class.getResourceAsStream("demo.txt")));

         */
        System.out.println("What is your age?");
        int answer = safeScanner.getInt();
        System.out.printf("Your age is %d.%n", answer);
        safeScanner.closeScanner();}
}
