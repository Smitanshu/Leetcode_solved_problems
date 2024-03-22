#include <iostream>
using namespace std;

bool check(int arr[], int size, int index)
{

    // base case
    if (index >= size)
    {
        return true;
    }

    // processing

    if (arr[index] > arr[index - 1])
    {
        // Recursive relation
        bool nextans = check(arr, size, index + 1);
        return nextans;
    }

    else
    {
        return false;
    }
}

int main()
{

    int arr[5] = {0, 20, 30, 40, 50};

    int size = sizeof(arr) / sizeof(arr[0]);

    bool ans = check(arr, size, 1);

    if (ans)
    {
        cout << "Array is sorted ";
    }

    else
    {
        cout << "Array is not started";
    }

    return 0;
}
