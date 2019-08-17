/**
 *  姓名：赵子豪
 *  日期2019年8月17日
 *  Retirement2.java
 */
 import java.time.Year;
import java.util.*;

 public class Retirement2
 {
    public static void main(String[] args)
    {
        //  read inputs
        Scanner in = new Scanner(System.in);

        System.out.println("How much money will you contribute every year ?");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        //  update account balance while user isn't ready to retire
        do
        {
            //  add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            year++;

            //  print current balance
            System.out.printf("After year %d, your balcance is %,.2f%n", year, balance);

            //  ask if ready to retire and get input
            System.out.println("Ready to retire? (Y/N)");
            input = in.next();
        }
        while (input.equals("N"));
    }
 }
