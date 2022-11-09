#include <stdio.h>

void selectionSort(int *vet, int tam){
    int aux, menor;
    
    for(int i = 0; i < tam-1; i++){
        menor = i; //take on the first value of the array as the less number and update for the next number at the next loop restart

        for(int j = i+1; j < tam; j++){
            //compare if have a less number at right on array
            if(vet[j] < vet[menor]){
                menor = j; //if has, the variable "menor" take on j value
            }
        }   

        //if menor variable was modified, the values of menor and the primary index are swapped
        if(menor != i){
            aux = vet[i];
            vet[i] = vet[menor];
            vet[menor] = aux;
        }
    }
}

int main(){
    int vet[5] = {4, 2, 9, 8, 1};
    int tam = sizeof(vet)/4;
    int aux, menor;

    selectionSort(vet, tam);

    for (int i = 0; i < 5; i++)
        printf("%d ", vet[i]);

    printf(" ");
}