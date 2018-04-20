package week11;

interface InfA
{
    void foo();
}

interface InfB
{
    void bar();
}


class FooBar implements InfA, InfB
{

    public void foo()
    {
        System.out.println("inside foo");
    }

    public void bar()
    {
        System.out.println("inside bar");
    }

}


class Parent
{
    void hello()
    {
        System.out.println("hello world");
    }
}

class Child extends Parent
{

}

class CustomClass implements InfB
{

    public void bar()
    {
        System.out.println("inside custom class");
    }
}

public class InterfaceDemo
{


    static void test(InfB bar_object)
    {
        bar_object.bar();
    }


    public static void main(String[] args)
    {

        FooBar fooBar = new FooBar();
        InfA foo = new FooBar();
        InfB bar = new FooBar();

        CustomClass test_object = new CustomClass();

        test(test_object);

    }

}
