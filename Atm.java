package Ass4.Ques3;
import java.util.Scanner;
    public class Atm {
        double balance= 2000.00;
        long id=98765;
        double deposit,amount;
        public void savingsaccount()  {
            System.out.println("account Id "+id);
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            {
                try {
                    if(n==1){
                        System.out.println("enter withdraw amount");
                        amount=sc.nextDouble();
                        withdraw();
                    }
                    if(n==2) {
                        System.out.println("enter deposit amount");
                        amount=sc.nextDouble();
                        deposit=balance+amount;
                        System.out.println("Total amount "+deposit);
                    }
                }
                catch(InsufficientBalanceException e) {
                    System.out.println(e);}
                catch(IllegalBankTransactionException e) {
                    System.out.println(e);
                }
            }
        }
        public void withdraw() throws InsufficientBalanceException,IllegalBankTransactionException
        {
            if(amount>balance)
            {
                throw new InsufficientBalanceException("insufficient balance enter less amount");
            }else{balance = balance-amount;
                if(amount<0) {
                    throw new IllegalBankTransactionException("enter valid amount");
                }
                System.out.println("current balance "+balance);}}

        public static void main(String args[])
        {

            Atm at=new Atm();
            at.savingsaccount();
        }

    }
    class IllegalBankTransactionException extends Exception{
        public IllegalBankTransactionException(String msg) {
            super(msg);
        }

    }
    class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String msg) {
            super(msg);
        }

    }


