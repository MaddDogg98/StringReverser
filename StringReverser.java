import java.util.Scanner;
import java.util.Stack;

public class StringReverser
{
    private static Stack sentence = new Stack();

    public StringReverser(String in)
    {
        for(int i = 0; i < in.length(); i++)
        {
            sentence.push(in.charAt(i));
        }

        while(sentence.isEmpty() != true)
        {
            System.out.print(sentence.pop());
        }
    }
}
