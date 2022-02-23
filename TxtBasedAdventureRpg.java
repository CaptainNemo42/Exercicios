/*
Jogo RPG Em texto baseado em D&D
Autor:João Valadares
Data:23/02/2022
*/
import java.util.Random;
import javax.swing.JOptionPane;

public class DeD{
	public static void main(String args[]);
		public class D20{
			public static void main(String args[]){
				Random rand = new Random(); 
				/*
				*int D20roll = rand.nextInt(21)
				*Usar quando for necessário Rolar um Dado de 20 Lados
				*int D100roll = rand.nextInt(101)
				*/
			
			}
		}
		system.out.println("----Jogo RPG Em texto baseado em D&D----");
		input = JOptionPane.showInputDialog{"Deseja iniciar o jogo? [S/N]: "};
	
		if (input == "S"){
			JOptionPane.showInputDialog{
				null, "Seja bem vindo, decida seu caminho [A/B]: ";
				if (input == "A"){
					JOptionPane.showInputDialog{""}
				}
				else if(input == "N"){
					JOptionPane.showInputDialog{""}
				}
				else{
					JOptionPane.showInputDialog{""}
				}
			}
		}else if(input == "N"){
			JOptionPane.showMessageDialog{null,"Certo, Então o programa será encerrado..."}
		}else{
			JOptionPane.showMessageDialog{"[Entrada incorreta! Tente Novamente]"}
		}
}


