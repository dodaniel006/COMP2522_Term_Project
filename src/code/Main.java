import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    private static final int NONE = 0;
    private static final String[] OPTIONS = {"W", "N", "M", "Q"};

    public static void main(final String[] args)
    {
        final StringBuilder sb;
        boolean runProgram;
        Scanner userInput;
        String entryMessage;

        sb         = new StringBuilder();
        userInput  = new Scanner(System.in);

        sb.append("Please select an option (case insensitive) from the menu below:\n");
        sb.append("W: Word Game\n");
        sb.append("N: Number Game\n");
        sb.append("M: My Game\n");
        sb.append("Q: Quit Program\n");

        System.out.println("Welcome to Daniel Do's Term Project.\n");
        entryMessage = sb.toString();
        runProgram = true;

        while (runProgram)
        {
            boolean isValidInput;
            isValidInput = false;
            do
            {
                System.out.println(entryMessage);

                final String input;

                input        = userInput.nextLine().trim().toUpperCase();
                isValidInput = Arrays.asList(OPTIONS).contains(input);

                if (isValidInput)
                {
                    switch (input)
                    {
                        case "W":
                            System.out.println("Starting Word Game...\n");
                            break;

                        case "N":
                            System.out.println("Starting Number Game...\n");
                            break;

                        case "M":
                            System.out.println("Starting My Game...\n");
                            break;

                        case "Q":
                            System.out.println("Quitting Program. Goodbye!");
                            runProgram = false;
                            break;
                    }
                }
            } while (!isValidInput);
        }


    }
}
