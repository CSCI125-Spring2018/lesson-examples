package week10;

public class Rectangle implements Comparable<Rectangle>
{

    private int width, height;

    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public int getArea()
    {
        return width * height;
    }

    public int compareTo(Rectangle other)
    {
        return getArea() - other.getArea();
    }

    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(10, 10);
        Rectangle r2 = new Rectangle(3, 4);

        int result = r1.compareTo(r2);

//        Integer i1 = new Integer(3);
//        Integer i2 = new Integer(4);
//        int result = i1.compareTo(i2);
        System.out.println(result);

    }






}
