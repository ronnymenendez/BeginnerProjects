/*
 * main.cpp
 *
 */
#include<iostream>
using namespace std;

int main()
{
	// declaration
    int rows;

    // input
    cout << "Enter the number of rows : ";
    cin >> rows;
    cout << endl;

    // processing
    for (int i = 0; i < rows; i++)
    {
        int val = 1;
        for (int j = 1; j < (rows - i); j++)
        {
            cout << "   ";
        }
        for (int k = 0; k <= i; k++)
        {
            cout << "      " << val;
            val = val * (i - k) / (k + 1);
        }
        cout << endl << endl;
    }
    cout << endl;
    return 0;
}




