/*
* 6. Write a Java program that accepts two floating point numbers and checks
* whether they are the same up to two decimal places.
*/
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        double numb1 = input.nextDouble();
        System.out.print("Enter Number2: ");
        double numb2 = input.nextDouble();
        input.close();
        System.out.println("========================");
        if (Math.abs(numb1 - numb2) <= 0.01) {
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are different.");
        }
    }
}