package week08;

import java.util.Arrays;

public class SortingDemo
{

    static void sort(int[] data)
    {
        for(int i=0; i<data.length; i++)
        {
            int j = minIndex(data, i);
            swap(data, i, j);
        }
    }

    static int minIndex(int[] data, int start)
    {
        int min_index = start;
        for(int i=min_index; i<data.length; i++)
        {
            if(data[i] < data[min_index])
                min_index = i;
        }
        return min_index;
    }

    static void swap(int[] data, int i, int j)
    {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void main(String[] args)
    {

        int[] array = {5, 7, 4, 6, 5, 2, -9, 7};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));

//        swap(array, 0, 2);
//        System.out.println(minIndex(array, 4));


    }

}
