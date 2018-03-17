package quizzes;

public class Quiz01
{
    static String printGradeMessage(char letterGrade)
    {
        String message;
        switch (letterGrade)
        {
            case 'A':
                message = "Excellent!";
                break;
            case 'B':
            case 'C':
                message = "Well done";
                break;
            case 'D':
                message = "You passed";
                break;
            case 'F':
                message = "Better try again";
                break;
            default:
                message = "Invalid grade";
        }
        System.out.println(message);
        return message;
    }

    static void printMessage2(char letterGrade)
    {
        if (letterGrade == 'A')
            System.out.println("Excellent!");
        else if(letterGrade == 'B' || letterGrade == 'C')
            System.out.println("Well done");
        else if(letterGrade == 'D')
            System.out.println("You passed");
        else if(letterGrade == 'F')
            System.out.println("better try again");
        else
            System.out.println("invalid");
    }

    static void test01()
    {
        printGradeMessage('A');
        printGradeMessage('B');
        printGradeMessage('C');
        printGradeMessage('D');
        printGradeMessage('E');
        printGradeMessage('F');
    }

    static void test02()
    {
        int x = 1;
        while(x < 50)
        {
            if(x % 2 == 0)
                x += 5;
            else
                x *= 4;
            System.out.println(x);
        }
    }

    static void test03()
    {
        int a = 7, b = 4, c = 9;
        b = ++a * c;
        c = a + b--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args)
    {
        test03();
    }
}
