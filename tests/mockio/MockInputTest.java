package mockio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class MockInputTest
{

    private static final String line_ending = System.lineSeparator();
    private PrintStream std_out;
    private InputStream std_in;
    private ByteArrayOutputStream mock_out;
    private ByteArrayInputStream mock_in;

    private String build_output(String... array)
    {
        StringBuilder builder = new StringBuilder();
        for(String line: array)
        {
            builder.append(line);
            builder.append(line_ending);
        }
        return builder.toString();
    }

    private void set_mock_input(String... array)
    {
        byte[] buffer = build_output(array).getBytes();
        mock_in = new ByteArrayInputStream(buffer);
        System.setIn(mock_in);
    }

    @Before
    public void setUp()
    {
        std_out = System.out;
        std_in = System.in;
        mock_out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(mock_out));
    }

    @After
    public void tearDown()
    {
        System.setOut(std_out);
        System.setIn(std_in);
    }

    @Test
    public void test_example_1()
    {
        set_mock_input("hello world");

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);

        String y = mock_out.toString().trim();
        String e = "hello world";
        assertEquals(e, y);
    }

    @Test
    public void test_example_2()
    {
        set_mock_input("1", "2", "3", "4", "-1");

        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            x = scanner.nextInt();
            if(x >= 0)
                System.out.println(x);
        } while (x >= 0);


        String y = mock_out.toString().trim();
        String e = build_output("1", "2", "3", "4").trim();
        assertEquals(e, y);
    }

    @Test
    public void test_example_3()
    {
        set_mock_input("1", "2", "3", "4", "-1");

        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            int x = scanner.nextInt();
            if (x < 1)
                break;
            System.out.println(x);
        }


        String y = mock_out.toString().trim();
        String e = build_output("1", "2", "3", "4").trim();
        assertEquals(e, y);
    }

}
