/*
* 3. Take three numbers from the user and print the greatest number
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        System.out.print("Enter Third Number: ");
        int num3 = input.nextInt();
        int greatNumber = num1 > num2? num1:num2;
        greatNumber = greatNumber > num3? greatNumber:num3;
        System.out.println("===========================");
        System.out.println("The greatest Number = " + greatNumber);
    }
}