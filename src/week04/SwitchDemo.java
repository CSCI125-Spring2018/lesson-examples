package week04;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class SwitchDemo
{

    static void test_1()
    {
        int x = 1;
        if (x == 1)
            System.out.println("one");
        else if (x == 2)
            System.out.println("two");
        else if (x == 3)
            System.out.println("three");
        else
            System.out.println("none of the above");
    }

    static void test_2()
    {
        int x = 3;

        switch(x)
        {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("none of the above");
        }
    }

    static void test_3()
    {
        String s1 = new String("Micheil");
        String s2 = "Micheil";

        System.out.println(s1 == s2);
        System.out.println(s2.equals(s1));
    }

    static void test_4()
    {
        int start = 100;
        int difference = 5;
        int stop = 94;

        for(int i=start; i >= stop; i-=difference)
        {
            System.out.println(i);
        }
    }

    static void test_5()
    {
        int start = 100;
        int difference = 2;
        int stop = 94;

        int i = start;

        for( ; ;)
        {
            if(i < stop)
                break;
            System.out.println(i);
            i -= difference;
        }
    }

    static void test_6()
    {
        boolean flag = false;
        do
        {
            System.out.println("hello");
        } while(flag);

    }

    static void test_7()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name:");
        String line = scanner.nextLine();
        System.out.printf("Hello, %s\n", line);
    }

    static void test_8()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a message:");
        String message = scanner.nextLine();

        int count;

        while(true)
        {
            System.out.println("enter a number:");
            count = scanner.nextInt();
            if(count < 0)
                System.err.println("not a valid value");
            else
                break;
        }

        for(int i=1; i<=count; i++)
            System.out.println(message);

    }

    static void test_9()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a message:");
        String message = scanner.nextLine();

        int count;

        do
        {
            System.out.println("enter a number:");
            count = scanner.nextInt();
            if(count < 0)
                System.err.println("not a valid value");
        } while(count < 0);

        for(int i=1; i<=count; i++)
            System.out.println(message);
    }

    public static void main(String[] args)
    {
        test_9();
    }

}
