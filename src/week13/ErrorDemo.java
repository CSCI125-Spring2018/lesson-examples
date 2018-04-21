package week13;


class MyException extends Exception
{
    public MyException(String message)
    {
        super(message);
    }
}

class MyLibrary
{
    void test(int x) throws MyException
    {
        if(x < 0)
            throw new MyException("number must be positive or zero");
        System.out.println(x);
    }
}


class ErrorDemo
{

    public static void main(String[] args)
    {

        int a = 7, b = 0;


//        try
//        {
//            int q = a / b;
//            System.out.println(q);
//        }
//        catch (ArithmeticException err)
//        {
//            System.out.println("cannot divide by zero");
//        }


        MyLibrary lib = new MyLibrary();

        try
        {
            lib.test(-1);
        } catch (MyException err)
        {
            //System.err.println(err);

            err.printStackTrace();

        }

        System.out.println("end of program");


    }

}