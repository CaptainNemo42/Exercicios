
package p01_jogo_4bcc;

import java.util.Random;

public class Zumbi extends Personagem 
    implements IInterjeicao {
    private final double MIN_DANO = 0.5;
    private final double MAX_DANO = 4.5;
    private final double MIN_ARMADURA = 1.5;
    private final double MAX_ARMADURA = 4.5;
    
    public double atacar() {
        this.ataque();
        return super.atacar(MIN_DANO, MAX_DANO);
    }

    public void defender(double dano) {
        super.defender(dano, MIN_ARMADURA, MAX_ARMADURA);
        this.defesa();
    }

    @Override
    public void ataque() {
        System.out.println("Plaw!");
    }

    @Override
    public void defesa() {
        System.out.println("Uh...");
    }
    
    
} // fim da classe
