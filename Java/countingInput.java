/*
This program counts the number of words, lines, and characters (not including whitespace) in a paper
Features: Using an external file
*/

import java.util.*;
import java.io.*;

public class Problem2
{
    public static void main(String[] args)
    {
        // Declarations
        int iWordCounter;
        int iLineCounter;
        int iCharacterCounterWithoutSpaces;
        int iCharacterCounterWithSpaces;

        String sTemp;

        // Initializations
        iWordCounter = 0;
        iLineCounter = 0;
        iCharacterCounterWithoutSpaces = 0;
        iCharacterCounterWithSpaces = 0;

        // Processing
        System.out.println("We will be testing a text file that is located in this project folder.");
        System.out.println("Let's take a look at: \"InputFile_Problem2.txt \"");
        System.out.println();

        try
        {
            // File Assignment To Variable And Scanner Object
            Scanner fiConsole = new Scanner (new File ("InputFile_Problem2.txt"));

            // Gets Counts
            while (fiConsole.hasNextLine())
            {
                // Gets Line Count
                sTemp = fiConsole.nextLine();
                iLineCounter ++;

                // Gets Word Count
                iWordCounter += new StringTokenizer(sTemp, " ").countTokens();

                // Gets Character Count, Including Spaces
                iCharacterCounterWithSpaces += sTemp.length();

                // Gets Character Count, Excluding Spaces
                for (int i = 0; i < sTemp.length(); i++)
                {
                    // Ensures That Spaces Are Not Counted
                    if (!sTemp.substring(i,i+1).equals(" "))
                    {
                        iCharacterCounterWithoutSpaces ++;
                    }
                }
            }

            // Output
            System.out.println("Number of Words: "+iWordCounter);
            System.out.println("Number of Lines: "+iLineCounter);
            System.out.println("Number of Characters, Including Spaces: "+iCharacterCounterWithSpaces);
            System.out.println("Number of Characters, Excluding Spaces: "+iCharacterCounterWithoutSpaces);

        }
        catch (FileNotFoundException sMsg)
        {
            System.out.println("File Not Found");
        }

    }
}
