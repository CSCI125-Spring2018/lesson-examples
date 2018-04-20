package week11;

class DrawableDemo
{

    static void drawAll(Drawable...drawables)
    {
        for(Drawable drawable: drawables)
            drawable.draw();
    }

    public static void main(String[] args)
    {

//        Dot dot = new Dot();
////        // dot.draw();
////
////        Drawable line = new HorizontalLine(5);
////        line.draw();

        //Drawable array[] = new Drawable[3];
        Drawable[] array = new Drawable[3];

        array[0] = new Dot();
        array[1] = new HorizontalLine(2);
        array[2] = new HorizontalLine(3);

        drawAll(array);


    }

}
