#include <stdio.h>
#include <stdlib.h>

struct tipoNo{
    int valor;
    struct tipoNo *prox;
};
int main(void) {
    struct tipoNo *head = NULL, *novo;
    int qtd = 1;
    while(qtd > 0){
        printf("Digite o valor: ");
        scanf("%d", &qtd);
        if(!(novo = malloc (sizeof(struct tipoNo)))){
            printf("Faltou memoria! \n");
            exit(1);
        }
        novo -> prox = head;
        head = novo;
        novo -> valor = qtd;
    }
    printf("\nFim da criacao da lista \n");
    printf("\nMostra a lista: \n");
    novo = head;
    while(novo != NULL){
        printf("Valor = %d\n", novo -> valor);
        novo = novo -> prox;
    }
    printf("\nDestruindo a lista: \n");
    novo = head;
    while(novo != NULL){
        head = head -> prox;
        free(novo);
        novo = head;
    }

    return 0;
}
