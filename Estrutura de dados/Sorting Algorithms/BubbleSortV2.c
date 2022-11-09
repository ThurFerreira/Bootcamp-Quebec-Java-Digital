#include <stdio.h>

void bubbleSort(int *v, int n)
{
    int i, aux, fim, troca;
    fim = n;
    do
    {
        troca = -1;
        for (i = 0; i < fim - 1; i++)
        {
            if (v[i] > v[i + 1])
            {
                aux = v[i];
                v[i] = v[i + 1];
                v[i + 1] = aux;
                troca = i;
            }
        }
        fim--;
    } while (troca != -1);
}

int main()
{
    int vet[5] = {4, 2, 9, 8, 1};
    int tam = sizeof(vet) / 4;

    bubbleSort(vet, tam);

    for (int i = 0; i < 5; i++)
        printf("%d ", vet[i]);

    printf(" ");

    return 0;
}