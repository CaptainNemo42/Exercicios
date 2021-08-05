/*Algoritmo para calcular idade em dias
 *Autor: João Victor Valadares Fernandes
 *Data da versão inicial:04/08/2021
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("====Algoritmo para calcular idade em dias==== \n");
	    System.out.print("Insira sua idade, em numeros: ");
	    int anos = (int) input.nextFloat();
	    System.out.print("Insira o mês atual do ano, utilizando números: ");
	    int meses = (int) input.nextFloat();
	    System.out.print("Insira o número do dia atual do mês: ");
	    int dias = (int) input.nextFloat();
	    anos = anos * 365;
	    meses = meses * 30;
	    int idade = dias + anos;
	    idade = idade + meses;
	    System.out.print("Sua idade Atual em dias é de: "+ idade);
	}
}
