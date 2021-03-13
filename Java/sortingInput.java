/**
 * Featuring:
 * Merge Sorting
 * Reading Files
 * ArrayList
 * Array
 */

import java.io.*;
import java.util.*;

public class Problem2
{
    /** Main **/
    public static void main(String[] args)
    {
        /** Declarations **/
        // Variables
        String name = " ";
        int size = 0;

        // Arrays
        ArrayList<String> alInput = new ArrayList<>();
        String[] listOfNames = null;
        String[] sortedArray = null;


        /** Processing - Populating ArrayList **/
        // Accepts "input.txt" File and Stores Data In A List
        try
        {
            Scanner input = new Scanner(new File("input.txt"));

            while (input.hasNext())
            {                                           //
                size ++;                                // Gets size of file and also
                name = input.nextLine();                // stores all names into an ArrayList
                alInput.add(name);                      //
            }

            listOfNames = new String [ size ];          //
            for (int i = 0; i < alInput.size(); i ++)   //
            {                                           // Populates A String array using data from ArrayList
                listOfNames[i] =  alInput.get(i);       //
            }                                           //

            // Output Unsorted List of Names
            System.out.println("Unsorted List of Names: \n");
            for (int i = 0; i < alInput.size(); i++)
            {
                System.out.println(listOfNames[i]);
            }
            clearSpace();

        }
        catch (FileNotFoundException sMsg)
        {
            System.out.println("Yikes!");

        }


        /** Processing - Merge Sort **/
        // Begin Merge Sort
        sortedArray = new String[size];
        sortedArray = sort(listOfNames);


        // Output Sorted List of Names
        System.out.println("Sorted Names: \n");
        for (int i = 0; i < sortedArray.length; i++)
        {
            System.out.println(sortedArray[i]);
        }
    }

    /** Methods **/
    public static void clearSpace()
    {
        System.out.println("_______________________________________");
        for (int i = 1; i <= 8; i++)
        {
            System.out.println();
        }
        System.out.println("_______________________________________");
    }


    public static String[] sort(String[] list)
    {
        // Declarations
        String[] left = null;
        String[] right = null;
        String[] sorted = new String[list.length];

        // Processing
        if (list.length >= 2)                                 // Will process as long as an array has two+ elements
        {
            left = new String[list.length/2];                       // successfully divides an array in half, regardless
            right = new String[list.length - (list.length/2)];      // if number of elements is even or odd

            // Populates Left Array
            for(int i = 0; i < left.length; i++)
            {
                left[i] = list[i];
            }

            // Populates Right Array
            for(int i = 0; i < right.length; i++)
            {
                right[i] = list[i + (list.length/2)];
            }

            // Calls itself again
            sort(left);
            sort(right);
            sorted = merge(list,left, right);
        }

        return sorted;
    }


    public static String[] merge(String[] list, String[] left, String[] right)
    {
        // Declarations
        int leftIndex = 0;
        int rightIndex = 0;

        // Processing
        for(int i = 0; i< list.length; i++)
        {
            // populate sorted array
            if( rightIndex >= right.length ||           // basically compares leftArray element to rightArray element
                    (leftIndex < left.length && left[leftIndex].compareToIgnoreCase(right[rightIndex]) < 0))
            {
                list[i] = left[leftIndex];      // sorted array takes leftArray element
                leftIndex++;
            }
            else
            {
                list[i] = right[rightIndex];    // sorted array takes rightArray element
                rightIndex++;
            }
        }
        return list;
    }
}
