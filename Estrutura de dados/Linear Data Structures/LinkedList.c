#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define WITHOUT_MEMORY 1
#define SUCESS 0
#define EMPTY_STACK 2

typedef struct node Node;
struct node
{
    Node *next;
    int info;
};

typedef struct node Node;
struct node
{
    Node *head;
};


// newNode cria um nó da pilha
Node *createNode(int *verify)
{
    Node *node;
    node = malloc(sizeof(Node));

    if (node == NULL)
    {
        *verify = WITHOUT_MEMORY;
    }
    else
    {
        *verify = SUCESS;
    }

    return node;
}

// deleteNode apaga um nó da pilha
void deleteNode(Node *node)
{
    if (node != NULL)
    {
        free(node);
    }
}

// empilhar insere um elemento no topo da pilha
int push(int element, int *verify, int position)
{
    Node *newNode;
    bool ok;
    Node aux;

    
    newNode = createNode(&ok);
    // tratamento de erro não foi possivel criar um novo node
    if (ok == WITHOUT_MEMORY)
    {
        *verify = WITHOUT_MEMORY;
    }

    for(int i = 0; i <= position; i++)

        if(i == position-1){
            aux.info = 
            aux.next =
        }

        if(i == position)
        newNode->info = element;
        newNode->next =  
        stack->head = newNode;
    
}
// desempilhar retira o elemento do topo da pilha
int pop(Stack *stack, int *verify)
{
    int poppedElement;
    Node *auxNode;

    if(isEmpty(stack) == true){
        *verify = EMPTY_STACK;

    }else{
        
        poppedElement = auxNode->info;
        auxNode->next = stack->head; //aponta o ponteiro auxiliar para onde está o topo atual
        stack->head = auxNode->next; //apontano o topo para o próximo nó da lista

        deleteNode(auxNode);

        *verify = SUCESS;

        return poppedElement;
    }
}

// vazia verifica se a pilha esta vazia
bool isEmpty(Stack *stack)
{
    if (stack->head == NULL)
    {
        return true;
    }
    else
    {
        return false;
    }
}

// cheia verifica se a pilha esta cheia
bool isFull()
{
    return false;
}

int main()
{

    return 0;
}