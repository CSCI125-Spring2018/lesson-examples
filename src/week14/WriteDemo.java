package week14;

import java.io.*;

class WriteDemo
{

    public static void main(String[] args)
    {

        String path = "src/week14/output.txt";
        File file = new File(path);

        FileOutputStream fileOutputStream = null;
        PrintWriter printWriter = null;

        try
        {
            fileOutputStream = new FileOutputStream(file);
            printWriter = new PrintWriter(fileOutputStream);
        } catch (FileNotFoundException err)
        {
            System.err.println("could not create file");
        }

        if(printWriter != null)
        {
            printWriter.write("line 1");
            printWriter.write("\n");
            printWriter.write("line 2\n");
            printWriter.write("line 3\n");
            printWriter.close();
        }


        try
        {
            if(fileOutputStream != null)
                fileOutputStream.close();
        } catch (IOException err)
        {
            err.printStackTrace();
        }


    }

}