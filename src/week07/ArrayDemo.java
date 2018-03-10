package week07;

class ArrayDemo
{
    public static void main(String[] args)
    {

        int[] data = new int[100];

//        int data2[];
//        data2 = new int[10];

        //          index:   0  1  2  3
        int[] known_items = {5, 2, 3, 5};

//        for(int counter=0; counter<known_items.length; counter++)
//        {
//            int value = known_items[counter];
//            System.out.println(value);
//        }

        int result;
        result = find(known_items, 5);
        System.out.println(result); // 0

        result = find(known_items, 3);
        System.out.println(result); // 2

        result = find(known_items, 9);
        System.out.println(result); // -1
    }

    static int find1(int[] data, int key)
    {
        int index = 0;
        boolean match = false;
        while(! match && index < data.length)
        {
            int value = data[index];
            if(key == value)
            {
                match = true;
            }
            index++;
            // index = index + 1;
        }

        if(match)
            return index-1;
        else
            return -1;
    }

    static int find(int[] data, int key)
    {
        for(int index=0; index<data.length; index++)
        {
            int value = data[index];
            if(value == key)
                return index;
        }
        return -1;
    }
}