/*
 * main.cpp
 *
 */

#include<iostream>
#include<random>
using namespace std;

int main()
{
    // Declarations
    int randomNumber;
    random_device rand;
    int guess;

    // Input
    cout << "Please enter a guess, 0-99: ";
    cin >> guess;
    cout << endl;

    // Generate a random number
    randomNumber = rand()%100;

    // Processing
    while ( guess != randomNumber)
    {
    	cout << "Response: ";

        if (guess < randomNumber) // guess is less than the randomly generated number
        {
            cout << "Too low!" << endl;
        }
        else if (guess > randomNumber) // guess is greater than the randomly generated number
        {
            cout << "Too high!" << endl;
        }

        cout << endl;
        cout << "Enter another guess: ";
        cin >> guess;
    }

    // Output upon entering the correct guess
    cout << endl;
    cout << "You got it! The random number is " << guess << ". Good job!" << endl;


    return 0;
}
