#include <stdio.h>

int binarySearch(int start, int end, int *vet, int value)
{
    int mid = (start + end) / 2;

    if (vet[mid] == value)
        return mid;

    else if (vet[mid] < value)
        start = mid + 1;

    else
        end = mid - 1;

    binarySearch(start, end, vet, value);
}

int main()
{
    int vet[10] = {9, 12, 23, 34, 45, 56, 67, 78, 89, 90};
    int start, end;
    int value = 90, index;

    start = 0;
    end = sizeof(vet) / 4;

    index = binarySearch(start, end, vet, value);

    printf("Elemento encontrado na posição: %d\n", index);

    return 0;
}