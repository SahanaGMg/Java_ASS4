package Ass4.Ques1;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first value");
            int a = sc.nextInt();
            System.out.println("Enter the first value");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("Result = " + c);
        }
        catch (java.lang.ArithmeticException e)
        {
            System.out.println("Cannot divide the number by zero");
        }

        
        

    }

}
