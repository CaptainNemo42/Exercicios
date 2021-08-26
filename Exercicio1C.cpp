#include <stdio.h>
#include <stdlib.h>
int main(){
	
	float sal; 
	//Entrada
	printf("Informe o salario a ser examinado: ");
	scanf("%f", &sal);
	
	//If-encadeado
	if(sal <= 0){//validacao de dados
		printf("Erro, entrada invalida ");
	}
	else{
		if(sal > 1000){
			printf("Imposto(%%10) = %.2f\n",sal*0.10);
			printf("O salario final, com reajuste dos impostos sera de: %f", sal);
		}
		else{
			printf("Imposto(%%5) = %.2f\n",sal*0.5);
			printf("O salario final, com reajuste dos impostos sera de: %f", sal);
		}
	}
	system("PAUSE");
}

