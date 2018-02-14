package week03;

class Example
{

    static int add(int a, int b)
    {
        int result = a + b;
        return result;
    }

    static void test01()
    {
        int y = add(1, 2);
        System.out.println(y);
    }

    static void hello1(String message, int count)
    {
        int counter = 0;
        while(true)
        {
            System.out.println(message);
            counter++;
            if (counter == count)
            {
                break;
            }
        }
    }

    static void hello2(String message, int count)
    {
        boolean flag = true;
        int counter = 0;
        while(flag)
        {
            System.out.println(message);
            counter++;
            flag = (counter < count);
        }
    }

    static void hello3(String message, int count)
    {
        int counter = 0;
        while(counter < count)
        {
            System.out.println(message);
            counter++;
        }
    }

    static void hello4(String message, int count)
    {
        for(int counter=0; counter<count; counter++)
        {
            System.out.println(message);
        }
    }

    static void hello5(String message, int count)
    {
        for(int counter=0; counter<count; counter++)
            System.out.println(message);
    }

    public static void main(String[] args)
    {
        // byte;
        // boolean;
        // int;
        // short;
        // long;
        // double;
        // float;
        // char;


        // String message = "hello world";
        // String message2 = new String("this is another string");
        // System.out.println(message2);


        int a = 2;
        int b = 4;

        // operators
        // > < == <= >= !=

        // if( a > b )
        // {
        //   System.out.printf("a is greater than b, %d > %d \n", a, b);
        // }
        // else
        // if ( a < b)
        // {
        //   System.out.printf("a is less than b, %d < %d \n", a, b);
        // }
        // else
        // {
        //   System.out.println("default case, a == b");
        // }

        // System.out.println("some more code");

        hello3("hello java", 5);

    }


}