package week14;


class AbstractDemo
{

    public static void main(String[] args)
    {

        SpeakInf person1 = new Person("Alex");

        person1.speak();

        SpeakInf robot1 = new Robot()
        {
            void abstract_method()
            {
                System.out.println("inside another method");
            }

            public void speak()
            {
                System.out.println("speaking from anon robot object");
            }


        };

        robot1.speak();

        //((Robot) robot1).test();

        Robot robot2 = (Robot) robot1;
        robot2.test();


        if(robot1 instanceof Robot)
            System.out.println("robot1 is a Robot");
        if(robot1 instanceof Person)
            System.out.println("robot1 is a Person");



    }

}