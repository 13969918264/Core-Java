/**
 *  ���������Ӻ�
 *  ���ڣ�2019��8��14��
 *  This program demonstrates console input
 *  InputTest.java
 */
import java.util.*;

public class InputTest 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //  get first input
        System.out.println("What's your name? ");
        String name = in.nextLine();

        //  get second input
        System.out.println("How old are you? ");
        int age = in.nextInt();

        //  display output on console
        System.out.println("Hello, " + name +". Next year, you'll be " + (age + 1));
    }
}