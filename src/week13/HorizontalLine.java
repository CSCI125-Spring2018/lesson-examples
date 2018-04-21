package week13;


class HorizontalLine implements Drawable
{

    private int length;

    public HorizontalLine()
    {
        this(1);
    }

    public HorizontalLine(int length)
    {
        this.length = length;
    }

    public void draw()
    {
        for(int count=0; count < length;count++)
            System.out.print('*');
        System.out.println();

    }
}