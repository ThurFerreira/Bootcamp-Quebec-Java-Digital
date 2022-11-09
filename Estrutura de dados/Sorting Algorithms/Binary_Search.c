#include <stdio.h>

int main()
{
    int array[10] = {9, 12, 23, 34, 45, 56, 67, 78, 89, 90};
    int tam = sizeof(array) / 4;
    int mid, end, start;
    int index, indexJ;
    int value = 45;
    int found = 0;

    end = tam - 1; // end index of array
    start = 0;     // start index of array

    // while dont reach the end of the array (only 2 elements) or find the value
    while (end - start > 1)
    {

        mid = (end + start) / 2; // getting the new search key each loop

        // if the mid part if the value that we suearch for, we capture the indexd
        if (array[mid] == value)
        {
            found = mid;
            break;

            // if the number at the index is less than value, we remove the left array's part
        }
        else if (array[mid] < value)
        {
            start = mid + 1; // mid + 1 to discart the mid number too

            // else we "remove" the right array's part
        }
        else
        {
            end = mid - 1; // mid - 1 to discart the mid number too
        }
    }

    // cases of loop exit
    if (found != 0)
    {
        printf("found at index: %d\n", found);
    }
    else if (array[start] == value)
    {
        printf("found at index: %d\n", start);
    }
    else if (array[end] == value)
    {
        printf("found at index: %d\n", end);
    }
    else
    {
        printf("value didn't found\n");
    }

    return 0;
}
