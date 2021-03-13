/*
 * main.cpp
 *
 * A fun end-of-the-week activity we had at iD Tech was the notorious 'Pie an Instructor in the Face' extravaganza.
 * Here, we would allow the campers to select an instructor to literally throw a shaving-foam pie in their face
 * As a little fun, quick activity, I would let each of my students come up to my computer and type in which instructor they'd like to pie
 * This activity was fun and engaging for the students, and increased their interest in programming
 */

#include<iostream>
using namespace std;

int main()
{
    // Declarations
    bool exists;
    int counter;
    string input;
    string names[30];
    int numbers[30];
    int tempNum;
    string tempName;

    // Initializations
    counter = 0;

    for (int i = 0; i < 30; i++)
    {
        numbers[i] = 0;
    }

    // Input
    cout << "Let's find out who the majority wants to pie." << endl;
    cout << "When you are done, enter \"done\"." << endl;
    cout << "Enter your target: ";
    cin >> input;

    // Target Entry
    while (input != "done")
    {
        exists = false;

        // Stores name to new element or increments existing element
        for(int i = 0; i < 30; i++)
        {
            if (input == names[i])
            {
                exists = true;
                numbers[i] += 1;
            }

        }

        if ( exists != true)
        {
            names[counter] = input;
            numbers[counter] += 1;
            counter ++;
        }
        cout << "Enter your target: ";
        cin >> input;

    }

    // Places arrays in order
    for (int j = 0; j < 30; j ++)
    {
    for(int i = 0; i < 30; i++)
    {
            if (numbers[i] < numbers[i+1] && numbers[i] > 0)
            {
                // Rearrange popularity
                tempNum = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = tempNum;

                // Rearrange Names
                tempName = names[i];
                names[i] = names[i+1];
                names[i+1] = tempName;
            }
    }
    }

    // Output
    // First Place
    cout << endl;
    cout << "First Place: " << endl;
    cout << names[0] << " with " << numbers[0] << " votes." << endl;

    // Second Place
    cout << endl;
    cout << "Second Place: " << endl;
    cout << names[1] << " with " << numbers[1] << " votes." << endl;

    // Third Place
    cout << endl;
    cout << "Third Place: " << endl;
    cout << names[2] << " with " << numbers[2] << " votes." << endl;
}




