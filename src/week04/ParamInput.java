package week04;

public class ParamInput
{

    static void array_intro()
    {
        int[] array = new int[3];
        array[0] = 12;
        array[1] = 45;
        array[2] = 6;

        for(int i=0; i<array.length; i++)
        {
            System.out.printf("%d: %d\n", i, array[i]);
        }
    }

    public static void main(String[] args)
    {
        int total = 0;
        for(int i=0; i<args.length; i++)
        {
            String arg = args[i];
            int num = Integer.parseInt(arg);
            total += num;
        }
        System.out.println(total);
    }

}
