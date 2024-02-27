#include <stdio.h>
#include <stdlib.h>

struct tipoNo{
    int valor;
    struct tipoNo *prox;
};

int resultado(struct tipoNo *parm);
int main(void) {
    struct tipoNo *head = NULL, *no;
    int qtd = 1, pos;
     for(pos = 0; pos < 5; pos++){
        printf("Digite o valor: ");
        scanf("%d", &qtd);
       
        if(!(no = malloc (sizeof(struct tipoNo)))){
            printf("Faltou memoria! \n");
            exit(1);
        }
        no -> prox = head;
        head = no;
        no -> valor = qtd;
        }
    printf("\nFim da criacao da lista \n");
    printf("\nMostra a lista: \n");
    no = head;
    
    mostrarLista(no);
    
    printf("\nDestruindo a lista: \n");
    no = head;
    while(no != NULL){
        head = head -> prox;
        free(no);
        no = head;
    }

    return 0;
}

int mostrarLista(struct tipoNo *parm){
    while(parm != NULL){
        printf("Valor = %d\n", parm -> valor);
        parm = parm -> prox;
    }
}

