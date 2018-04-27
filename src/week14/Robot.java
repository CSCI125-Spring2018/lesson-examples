package week14;

abstract class Robot implements SpeakInf
{

    private String name;
    private int year;


    public void test()
    {
        System.out.println("test method");
        abstract_method();
    }


    abstract void abstract_method();


}