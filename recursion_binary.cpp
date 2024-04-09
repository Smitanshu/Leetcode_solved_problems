#include <iostream>
#include<vector>
using namespace std;
bool binary(vector<int>& arr, int start, int end, int target)  // vector passed by reference
{

    int mid = (start + end) >> 1;  //same as start+(end-start)/2;

    if (start > end)//base condition
    {
        return false;
    }
    if (arr[mid] == target)//Element present in the vector
    {
        return true;
    }

    if (arr[mid] < target)
    {
        return binary(arr, mid + 1, end, target);
    }
    if (arr[mid] > target)
    {
        return binary(arr, start, mid - 1, target);
    }

    return false;
}
int main()
{
    vector<int>arr = {10, 20, 30, 40, 50};
    int start=0;
    int end=arr.size()-1;
    int target=30;
    bool ans = binary(arr, start, end, target);

    if (ans == true)
    {
        cout << " Element found";
    }
    else
    {
        cout << " Element not found";
    }

    return 0;
}
