/*
* 5. Write a program in Java to display the pattern like right
* angle triangle with a number.
*/



import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int numb = input.nextInt();
        System.out.println("========================");
        for(int i=1;i<=numb;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
