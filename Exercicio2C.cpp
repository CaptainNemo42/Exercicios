#include <stdio.h>
#include <stdlib.h>
int main(){
	float diaria;
	printf("====Algoritmo de Hotel==== \n");
	printf("Insira o numero de diarias: \n");
	scanf("%f", &diaria);
	if (diaria < 15){
		diaria = diaria * 150 + (diaria * 8);
		printf("O valor cobrado sera de:R$ %.2f\n", diaria);
	}
	else{
		if(diaria = 15){
			diaria = diaria * 150 + (diaria * 6);
			printf("O valor cobrado sera de:R$ %.2f\n", diaria);
		}
		else{
			diaria = diaria * 150 + (diaria * 5.50);
		printf("O valor cobrado sera de:R$ %.2f\n", diaria);
		}
	}
	system("PAUSE");
}
