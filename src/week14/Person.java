package week14;

class Person implements SpeakInf
{

    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public void speak()
    {
        System.out.println("Hello, my name is " + name);
    }
}