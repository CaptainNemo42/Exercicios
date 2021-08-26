#include <stdio.h>
#include <stdlib.h>
int main(){
	//Definição de variaveis
	int pao;
	int broa;
	float total;
	float poup;
	//Entradas
	printf("Insira a quantidade de paes vendidos:\n");
	scanf("%d", &pao);
	printf("Insira a quantidade de broas vendidas:\n");
	scanf("%d", &broa);
	//Print do total de vendas
	printf("Total de vendas: %d\n", pao + broa);
	//calculo do valor total
	total = pao * 0.12;
	total = total +(broa * 1.50);
	//Print do Valor total
	printf("O valor total foi de: %.2f\n", total);
	//calculo da poupança
	poup = total * 0.10;
	//Print da poupança
	printf("O total a ser poupado sera de: %.2f\n", poup);
	system("PAUSE");
}
