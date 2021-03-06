
package p01_jogo_4bcc;

public class Guerreiro extends Personagem 
    implements IInterjeicao {
    
    private final double MIN_DANO = 1.5;
    private final double MAX_DANO = 5.0;
    private final double MIN_ARMADURA = 0.5;
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
        System.out.println("Pow!");
    }

    @Override
    public void defesa() {
        System.out.println("Ouch...");
    }
    
    
    
    
} // fim da classe
