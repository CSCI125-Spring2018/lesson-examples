package week14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class ReadDemo
{

    public static void main(String[] args) {

        String path = "src/week14/example2.txt";

        File file = new File(path);

        FileInputStream fileInputStream = null;
        Scanner scanner = null;

        try {
            fileInputStream = new FileInputStream(file);
            scanner = new Scanner(fileInputStream);
        } catch (FileNotFoundException err) {
            System.err.println("could not read file");
        }

        if (scanner != null)
        {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        }

        try
        {
            if(fileInputStream != null)
                fileInputStream.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}