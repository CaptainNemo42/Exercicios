
package p01_jogo_4bcc;

public class P01_Jogo_4BCC {

    public static void main(String[] args) throws InterruptedException {
        Guerreiro g = new Guerreiro();
        Zumbi z = new Zumbi();
        int contBatalha = 1;
        
        while(g.getVida() > 0 && z.getVida() > 0) {
            System.out.println("Iniciando da batalha #"+contBatalha);
            double danoGuerreiro = g.atacar();
            z.defender(danoGuerreiro);
            double danoZumbi = z.atacar();
            g.defender(danoZumbi);
            System.out.printf("Guerreiro %.2f vs %.2f Zumbi\n", 
                    g.getVida(), z.getVida());
            contBatalha++;
            Thread.sleep(1500);
        } // fim while
        
        if (g.getVida() > 0 && z.getVida() == 0) {
            System.out.println("Guerreiro wins!");
        } else if (g.getVida() == 0 && z.getVida() > 0) {
            System.out.println("Zumbi wins!");
        } else {
            System.out.println("Empate...");
        }

        
    } // fim do main
    
} // fim da classe
