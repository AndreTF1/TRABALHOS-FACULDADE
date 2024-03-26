#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main (void){
    int tamanho = 50000;
    int vet[tamanho], aux, inte, exte;
    clock_t tempoInic, tempoFim, tempoDecorrido;
    
    for(inte=0; inte<tamanho;inte++){
        vet[inte]=rand();
    }
    tempoInic=clock();
    //Inicia o relógio
    for(exte = 0;exte < tamanho-1; exte++){
        for(inte = exte+1; inte < tamanho; inte++){
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
    printf("Duracao do vetor desodernado = %.1f\n \n",(double)tempoDecorrido/(CLOCKS_PER_SEC)); 
    
    // Vetor ordenado
    tempoInic = clock();
    for(exte = 0;exte < tamanho-1; exte++){
        for(inte = exte+1; inte < tamanho; inte++){
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
    printf("Duracao do vetor ordenado = %.1f\n", (double)tempoDecorrido/(CLOCKS_PER_SEC)); 
    
    return 0;
}

