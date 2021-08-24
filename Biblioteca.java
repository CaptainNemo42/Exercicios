/*Algoritmo para estudo de JAVA POO, inspirado em uma biblioteca
 *Autor: João Victor Valadares Fernandes
 *Data da versão inicial:24/08/2021
 *Status:Incompleto
*/
import java.lang.Math;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        
        scanner sc = new Scanner(System.in); //Definição da entrada de dados
        
        public class biblioteca{
            
            private int ident[] = new int[1,2,3,4]; //para uso em "empréstimo"
            private void cadastro(ident){
                
            int min=0;
            int max=4;
            
            ident = Math.floor(Math.random()*(max-min+1)+min); //Gera um número aleatório dentro do limite de usúarios
            System.out.print("Seu número de cadastro é" + ident " , use-o ao fazer o empréstimo de um livro!" );
            } //Fim do cadastro
            
        } //Fim da classe biblioteca
        
	    public class livro{
	        
	        //Definição dos atributos
	        public String autor;
	        public String nome;
	        public int id_livro;
	        //Criação dos objetos
	        livro poesia = new livro(autor, nome);
	        livro fisica = new livro(autor, nome);
	        
	        //Definição de valores do objeto poesia
	        poesia.autor = "Bukowski";
	        poesia.nome = "Cartas na rua";
	        poesia.id_livro = 2282;
	        
	        //Definição de valores do objeto fisica
	        fisica.autor = "Neil deGrasse Tyson";
	        fisica.nome = "Astrofísica para apressados";
	        fisica.id_livro = 2239;
	        
	        public void emprestimo(){
	            public int emprest_livro = 0;
	            private String input;
	            System.out.println("Você deseja emprestar esta revista?[S/N]");
	            input = sc.nextLine();
	            if input == 'S'{
	                System.out.println("Qual o seu cadastro")
	                emprest_livro = emprest_livro++
	            }else if input == 'N'{
	                System.out.print("Não houve empréstimo.")
	            }else{
	                System.out.print("Entrada inválida, tente novamente.")
	            }
	            
	        }//Fim do método emprestimo
	        public static void devolução(emprest_livro)
	            System.out.println("Você deseja devolver o livro?[S/N]");
	            input = sc.nextLine();
	            if input == 'S'{
	                emprest_livro = emprest_livro--
	            }else if input == 'N'{
	                System.out.print("Ok, o livro permanecerá com você.")
	            }else{
	                System.out.print("Entrada inválida, tente novamente.")
	            }
	    }//fim da classe livro
	    
	    public class revista extends livro{
	        
	        //Definição dos atributos
	        public String jornalista;
	        public String redator;
	        
	        //Criação de objetos da classe revista
	        revista veja = new revista(jornalista, redator);
	        revista capricho = new revista(jornalista, redator);
	        
	        //Definição de valores do objeto veja
	        veja.jornalista = "Peter Parker";
	        veja.redator = "J. J. Jameson";
	        
	        //Definição de valores do objeto capricho
	        capricho.jornalista = "Clark kent";
	        capricho.redator = "Lois Lane";
	        
	        public void emprestimo(){
	            public int emprest_livro = 0;
	            private String input;
	            System.out.println("Você deseja emprestar esta revista?[S/N]");
	            input = sc.nextLine();
	            if input == 'S'{
	                emprest_livro = emprest_livro++
	            }else if input == 'N'{
	                System.out.print("Não houve empréstimo.")
	            }else{
	                System.out.print("Entrada inválida, tente novamente.")
	            }
	            
	        }//Fim do método emprestimo
	        
	        public class programa(autor, nome, id_livro){
	            livro historia = new livro(autor, nome);
	            historia.autor = "Maurice Leblanc";
	            historia.nome = "Arsène Lupin";
	            historia.id_livro = 2238;
	        }
	        
	    }//Fim da classe
	    
	}//Fim do método main

}//Fim do programa