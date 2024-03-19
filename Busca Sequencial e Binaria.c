#include <stdio.h>
#include <stdlib.h>

#define SIZE 10

void preencherVetor(int vet[], int tamanho) {
	int pos;
    rand();
    for (pos = 0; pos < tamanho; pos++) {
        vet[pos] = rand() % 100; // Gera números aleatórios entre 0 e 99
    }
}

void mostrarVetor(int vet[], int tamanho) {
	int pos;
    for (pos = 0; pos < tamanho; pos++) {
        printf("%d ", vet[pos]);
    }
    printf("\n");
}

void ordenarVetor(int vet[], int tamanho) {
	int i, j;
    for (i = 0; i < tamanho - 1; i++) {
        for (j = 0; j < tamanho - i - 1; j++) {
            if (vet[j] > vet[j + 1]) {
                int temp = vet[j];
                vet[j] = vet[j + 1];
                vet[j + 1] = temp;
            }
        }
    }
}

int buscarNumero(int vet[], int tamanho, int numero) {
	int pos;
    for (pos = 0; pos < tamanho; pos++) {
        if (vet[pos] == numero) {
            return pos;
        }
    }
    return -1;
}

int main() {
    int vet[SIZE];
    int numero;
    
    preencherVetor(vet, SIZE);
    printf("Vetor gerado aleatoriamente:\n");
    mostrarVetor(vet, SIZE);
    
    printf("\nDigite um numero para buscar no vetor: ");
    scanf("%d", &numero);
    
    int sequencial = buscarNumero(vet, SIZE, numero);
    if (sequencial != -1) {
        printf("\nO numero %d foi encontrado na %d° posicao \n", numero, sequencial);
    } else {
        printf("\nO numero %d nao foi encontrado no vetor \n", numero);
    }
    
    ordenarVetor(vet, SIZE);
    printf("\nVetor ordenado:\n");
    mostrarVetor(vet, SIZE);
    
    int binario = buscarNumero(vet, SIZE, numero);
    if (binario != -1) {
        printf("\nO numero %d foi encontrado na %d° posicao\n", numero, binario);
    } else {
        printf("\nO numero %d nao foi encontrado no vetor.\n", numero);
    }
    
    return 0;
}

