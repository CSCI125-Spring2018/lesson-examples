package week05;

import java.util.Scanner;

public class ScannerReview
{

    static void test01()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a message");
        String line = keyboard.nextLine();
        System.out.println(line);
    }

    static void test02()
    {
        Scanner keyboard = new Scanner(System.in);
        while(true)
        {
            System.out.println("enter a message");
            String line = keyboard.nextLine();
            System.out.println(line);

            if(line.equals("exit"))
                break;
        }
    }

    static void test03()
    {
        String test_input = "add 12,3";
        String[] array = test_input.split("[ |,]");
        int a = Integer.parseInt(array[1]);
        int b = Integer.parseInt(array[2]);
        System.out.println(a+b);
    }

    static void handle(String line)
    {
        /* this method performs a calculation based on the line */
        String[] array = line.split("[ |,]");
        String cmd = array[0];

        int a=-1, b=-1;

        if(array.length == 3)
        {
            a = Integer.parseInt(array[1]);
            b = Integer.parseInt(array[2]);
        }

//        if(cmd.equals("add"))
//            System.out.println(a + b);
//        else if(cmd.equals("sub"))
//            System.out.println(a - b);
//        else

        switch (cmd)
        {
            case "add": System.out.println(a+b); break;
            case "sub": System.out.println(a-b); break;
            case "mul": System.out.println(a*b); break;
            case "div": System.out.println(a/b); break;
            case "exit": System.exit(0);
        }
    }

    static void test04()
    {
        Scanner keyboard = new Scanner(System.in);
        while (true)
        {
            String line = keyboard.nextLine();
            handle(line);
        }

    }

    public static void main(String[] args)
    {
        test04();
    }

}
