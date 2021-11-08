package Ass4.Ques2;
import java.io.*;
import java.util.Scanner;

public class UserDefined {
    static void input(int n ,int d) throws UnsupportedOperationException{
        if (d == 0)
        {
            throw new UnsupportedOperationException("Exception");
        }
        int c = n/d;
        System.out.println("Result = " + c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator value");
        int n = sc.nextInt();
        System.out.println("Enter the denominator value");
        int d = sc.nextInt();
        try {
            input(n,d);

        }
        catch (UnsupportedOperationException e)
        {
            System.out.println("Cannot divide the number by zero");
        }
    }
}
class UnsupportedOperationException extends Exception{
    UnsupportedOperationException(String exceptionText){
        super(exceptionText);
    }

}
