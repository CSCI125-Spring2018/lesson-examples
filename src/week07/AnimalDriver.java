package week07;

class AnimalDriver
{
    public static void main(String[] args)
    {
//        System.out.println("test");

//        String message = "hello world";
//        String message = new String("hello world");


        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Rex");

        dog1.setName("Spot");

        //System.out.println(dog1.getName());
        //System.out.println(dog2.getName());

        System.out.println(dog1);
        System.out.println(dog2);

        dog1.setName("Rex");
        System.out.println(dog1.equals(dog2));


//        String s1 = new String("hello world");
//        String s2 = new String("hello world");

//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));


    }
}