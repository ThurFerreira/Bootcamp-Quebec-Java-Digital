#include <stdlib.h>
#include <stdio.h>
#define MAX 10

struct pilha{
  int topo;
  char elementos[MAX];
};

typedef struct pilha Pilha; //tipo Pilha

Pilha * criar(int *deuCerto){
    Pilha *p;
    
    p = (Pilha *) malloc(sizeof(Pilha));
    
    if(p == NULL)
    {
        *deuCerto = 0; //0 == false
    }
    else
    {
        *deuCerto = 1; //1 == true;
        p->topo = -1;
    }
    
    return p;
}

void destruir(Pilha *p)
{
    if (p != NULL)
    {
        free(p);
    }    
    
}

int vazia(Pilha *p)
{
    if(p->topo == -1) //a pilha eh vazia
    {
        return 1; //1 = true
        
    }else{
        return 0; //0 = false
    }
}

int cheia(Pilha *p)
{
    if(p->topo == MAX-1) //a pilha esta cheia
    {
        return 1; //1 = true
        
    }else{
        
        return 0; //0 = false
    }
}

int empilhar(Pilha *p, char valorParaEmpilhar)
{
    if(cheia(p) == 1) // pilha esta cheia
    {
        return 0;
        
    }else{ // pilha nao esta cheia
        
        p->topo += 1;
        
        p->elementos[p->topo] = valorParaEmpilhar;
        
        return 1;
    }
}

char desempilhar(Pilha *p, int *deuCerto){
    
    char valorDesempilhado;
     
   if(vazia(p) == 1)
   {
       *deuCerto = 0;
       
   }else{
       
    valorDesempilhado = p->elementos[p->topo];
    p->topo -= 1;
    *deuCerto = 1;
    
    return valorDesempilhado;
    
   }
    
}

int main()
{
    Pilha *p;
    int *deuCerto;
    char valorDesempilhado;
    
    p = criar(deuCerto);
    
    if(deuCerto == 0)
    {
        //tratar o erro...
        printf("nao foi possivel criar a pilha");
        exit(1); //mais usual na Main
    }
    
    empilhar(p, 'a');
    empilhar(p, 'b');
    empilhar(p, 'c');
    
    if(cheia(p) == 1) 
    {
        printf("Pilha cheia!\n");
    }
    
    printf("%c\n", p->elementos[p->topo]);
    
    
    valorDesempilhado = desempilhar(p, deuCerto);
    
    if(vazia(p) == 1) 
    {
        printf("Pilha vazia!\n");
    }
    
    printf("%c", valorDesempilhado);
    
    destruir(p);
}