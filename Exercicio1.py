'''
 Algoritmo para calcular idade em dias
 Autor: João Victor Valadares Fernandes
 Data da versão inicial:04/08/2021
'''
print("====Algoritmo para calcular idade em dias==== \n")
anos = int(input("Insira sua idade, em numeros: "))
dias = int(input("Insira o número do dia atual do mês: "))
meses = int(input("Insira o mês atual do ano, utilizando números: "))
if meses > 12:
    print("Entrada invalida")
anos = anos * 365
meses = meses * 30
idade = dias + anos
idade = idade + meses
print("Sua idade Atual em dias é de: ", idade)