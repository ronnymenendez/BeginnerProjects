/*
 * main.cpp
 *
 * 'Green Glass Doors' was a fun beginner project that I would share with my iD Tech Students.
 * 	The program functions in a way that compares the first character to the second character of some string input.
 * 	if the comparison is true, then the input passes the 'Green Glass Doors' test; otherwise, it fails.
 * 	This is a useful project for introducing simple arrays, conditions, and for-loops
 *
 */
#include<iostream>
#include<random>
using namespace std;


int main()
{
Begin:

    // Declarations
    string input;
    bool success;

    // Initialization
    success = false;

    // Input
    cout << "Enter your word to see if it will pass through the Green Glass Doors..." << endl;
    cin >> input;

    // Processing - determines if the first two characters of the input are equal
    for (int i = 0; i < input.length(); i ++)
    {
        if (input[i] == input[i+1])
        {
            success = true;

        }
    }

    // Output after entering a word
    if ( success == true ) // successful
    {
        cout << "Good job, human, hopefully you understand why and it wasn't just sheer luck." << endl;
    }
    else // unsuccessful
    {
        cout << "Sorry, plebeian, but your word will not pass through the doors. " << endl;
    }
    cout << endl;

    // Asks user if they want to play again
    cout << "Would you like to try again?: ";
    cin >> input;

    // Redirects user appropriately
    if (input == "yes" || input == "yea")
    {
        cout << endl;
        goto Begin;
    }
    else if (input == "no" || input == "nope" || input == "na")
    {
        cout << "Goodbye, human." << endl << endl;
    }


}

