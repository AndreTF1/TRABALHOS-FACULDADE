#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define tamanho 50000

int main (void) {
    int vet[tamanho], troca;
    register int aux, pos;
    clock_t tempoInic, tempoFim, tempoDecorrido;
    
    for(pos = 0; pos < tamanho; pos++){
        vet[pos] = rand();
    }
    tempoInic = clock();
    troca = 1;
    
    while(troca == 1){
        troca = 0;
        for(pos = 0; pos < tamanho-1; pos++){
            if(vet[pos] > vet[pos+1]){
                aux = vet[pos];
                vet[pos] = vet[pos+1];
                vet[pos+1] = aux;
                troca = 1;
            }
        }
    }
    
   tempoFim = clock();
    tempoDecorrido = tempoFim - tempoInic;
    printf("Duracao do vetor desodernado = %.1f\n \n", (double)tempoDecorrido / (CLOCKS_PER_SEC)); 
    
    // Vetor ordenado
    tempoInic = clock();
    for(int exte = 0; exte < tamanho-1; exte++){
        for(int inte = exte+1; inte < tamanho; inte++){
            if(vet[exte] > vet[inte]){
                aux = vet[exte];
                vet[exte] = vet[inte];
                vet[inte] = aux;
            }
        }
    }
    //Consulta o relógio e mostra o tempo decorrido.
    tempoFim = clock();
    tempoDecorrido = tempoFim - tempoInic;
    printf("Duracao do vetor ordenado = %.1f\n", (double)tempoDecorrido /(CLOCKS_PER_SEC)); 
    
    return 0;
}
