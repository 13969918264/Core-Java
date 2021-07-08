/**
 *  姓名：赵子豪
 *  日期：2019年8月18日
 *  LotteryOdds.java
 */

import java.util.*;

public class LotteryOdds 
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers dou you need to draw? ");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw? ");
        int n = in.nextInt();

        /*
         *compute binomial coefficient n * (n - 1) * (n - 2)*...*(n - k + 1) / (1 * 2 * 3 *...* k)
         */

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * (n -i + 1) / i;
        
        System.out.println("You odds are i in " + lotteryOdds +". Good luck!");
    }
}
