/*
* 2. Write a Java program to get a number from the user and print whether it is
* positive or negative.
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int checkVar = input.nextInt();
        String varType = "";
        if (checkVar != 0 ){
            if (checkVar > 0){
                varType = "Positive";
            }else {
                varType = "Negative";
            }
        }else {
            varType = "Zero";
        }
        System.out.println("Number is " + varType);
    }
}
