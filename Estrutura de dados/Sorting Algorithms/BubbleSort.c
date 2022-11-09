#include <stdio.h>

void swap(int *vet1, int *vet2)
{
    int aux;

    aux = *vet1;
    *vet1 = *vet2;
    *vet2 = aux;
}

void bubblesort(int *vet, int tam)
{
    int i;

    for (i = 0; (i < tam - 1) || (tam > 1); i++)
    {
        if (vet[i] > vet[i + 1])
            swap(&vet[i], &vet[i + 1]);

        if (i == tam - 2)
        {
            tam--;
            i = -1;
        }
    }
}

int main()
{
    int vet[5] = {4, 2, 9, 8, 1};
    int tam = sizeof(vet) / 4;
    int i;

    bubblesort(vet, tam);

    for (int i = 0; i < 5; i++)
        printf("%d ", vet[i]);

    printf(" ");

    return 0;
}