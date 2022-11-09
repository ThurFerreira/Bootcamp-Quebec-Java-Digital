#include <stdio.h>

void buscaOrdenada(int *vet, int value){
    int end = 10;
    int achou = 0;

       for(int i = 0; i < end && vet[i] <= value; i++){

            if(vet[i] == value && achou == 0){
                printf("(Busca ordenada) Elemento encontrado na posição: %d", i);
                achou++;

            }else if(vet[i] == value){
                printf(", %d", i);
            }

       }

       printf(" ");

       if(achou == 0){
        printf("(Busca ordenada) O elemento não está no vetor!\n");
       }
}

void buscaLinear(int *vet, int value){
    int achou = 0;
    int end = 10;

    for(int i = 0; (i < end) || (achou == 0); i++){
        if(vet[i] == value){
            printf("(Busca Linear) Elemento encontrado na posição: %d\n", i);
            achou++;
        }
    }

    if(achou == 0)
        printf("(Busca Linear) O elemento não está no vetor!\n");

}

int main(){
    int linear[20] = {74,48,34,42,56,92,78,21,60,7};
    int ordenado[10] = {9,12,23,23,23,23,67,78,89,90};

    buscaLinear(linear, 21);

    buscaOrdenada(ordenado, 23);

    return 0;
}