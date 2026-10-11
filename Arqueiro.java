public class Arqueiro extends Personagem {
    public Arqueiro(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " dispara uma flecha!");
    }
}
