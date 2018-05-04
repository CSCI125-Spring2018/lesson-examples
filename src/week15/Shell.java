package week15;

import java.util.Scanner;

class Shell
{

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("welcome to the shell");

        boolean go = true;

        while(go)
        {
            System.out.print(">> ");
            String line = keyboard.nextLine();
            String[] array = line.split(" ");

            if(array.length < 1)
                continue;

            String command = array[0];

            switch (command)
            {
                case "exit":
                    go = false;
                    break;

                case "help":
                    System.out.println("some help message");
                    break;

                default:
                    if(command.length() > 0)
                        System.err.println("unknown command");
            }


            // "" -> [""]
            // "draw" -> ["draw"]
            // "resize 5 3" -> ["resize", "5", "3"]


        }

        keyboard.close();
    }


}