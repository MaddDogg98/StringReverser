import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        String words = "";

        System.out.println("Please enter the sentence/word you wish to reverse:");
        words = key.nextLine();

        StringReverser reverser = new StringReverser(words);
    }
}
