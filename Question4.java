/*
* 4.  Write a Java program that takes the user to provide a single character
* from the alphabet. Print Vowel or Consonant, depending on the user input.
* If the user input is not a letter (between a and z or A and Z), or is a string
* of length &gt; 1, print an error message.
*/
import java.util.*;

public class Main {
    public static boolean isAlpha(String s) {
        return s != null && s.matches("^[a-zA-Z]*$");
    }

    public static boolean VowelConsonant(char ch){
        boolean condition = false;
        switch (ch) {
            case 'a','e','i','o','u':
                condition  = true;
                break;
            default:
                condition = false;
        }
        return condition;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string :  ");
        String str = input.next();
        System.out.println("========================");
        if(str.length() == 1 && isAlpha(str)){
            if(VowelConsonant(str.toCharArray()[0])){
                System.out.println("letter is Vowel");
            }else {
                System.out.println("letter is Consonant");
            }
        }else {
            System.out.println("error Massage:'string not matches format'");
        }

    }
}