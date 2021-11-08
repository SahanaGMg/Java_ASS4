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

        try {
            int num = Integer.parseInt("Edureka");
            System.out.println(num);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Number format Exception");
        }
        try {
            int[] arr = new int[5];
            arr[8]=10;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index not found");
        }
        try {
            String str = "hello";
            str.charAt(8);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("String index not found");
        }
        

    }

}
