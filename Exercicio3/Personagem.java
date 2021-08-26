
package p01_jogo_4bcc;

import java.util.Random;

public class Personagem {
    // atributos:
    private String nome;
    private double vida = 10.0;

    // construtores:
    public Personagem() {
    }

    public Personagem(String nome) {
        this.setNome(nome);
    }

    @Override
    public String toString() {
        return "Personagem{" + "nome=" + nome 
                    + ", vida=" + vida + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 1) {
            this.nome = nome;
        } else {
            System.err.println("Erro! Nome inválido");
            System.exit(0);
        }
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        if(vida > 0) {
            this.vida = vida;
        } else {
            this.vida = 0.0;
        }
    }
    
    public double atacar(double MIN_DANO, double MAX_DANO) {
        Random r = new Random();
        return MIN_DANO + (MAX_DANO - MIN_DANO) * r.nextDouble();
    }
    
    public void defender(double dano, double MIN_ARMADURA, 
            double MAX_ARMADURA) {
        Random r = new Random();
        double defesa = MIN_ARMADURA + (MAX_ARMADURA - MIN_ARMADURA) 
                * r.nextDouble();
        double ataque = dano - defesa;
        if (ataque > 0)
            this.setVida(this.getVida() - ataque);
    }
    
    
    
    
} // fim da classe
