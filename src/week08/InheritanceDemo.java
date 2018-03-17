package week08;


/*
 * Person
 - name: String
 - age: int
 + getName(): String
 + setName(String): void
 */

class Person
{
    private String name;
    private int age;

    public String getName()
    {
       return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String toString()
    {
        return String.format("[name: %s] [age: %d]", name, age);
    }

    public boolean equals(Person other)
    {
        return this.name.equals(other.name) && this.age == other.age;
    }

    public int compareTo(Person other)
    {
        return 0;
    }
}


class Student extends Person
{
    private String major;
    private double gpa;


    public String getMajor()
    {
        return major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public double getGpa()
    {
        return gpa;
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    public String toString()
    {
        return super.toString() + " " + String.format("[major: %s] [gpa: %.2f]", major, gpa);
    }
}

public class InheritanceDemo
{

    public static void main(String[] args)
    {
        Person[] people = new Person[10];
        people[0] = new Person();
        people[1] = new Student();

        people[0].setName("Some Person");
        people[0].setAge(20);

        people[1].setName("Some Student");
        people[1].setAge(21);

//        for(Person p: people)
//            System.out.println(p);


        //System.out.println(people[0].equals(people[1]));

        Student s = new Student();
        System.out.println();

    }

}
