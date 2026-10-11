public class Main {
    public static void main(String[] args) {
        Personagem[] personagens = {
            new Guerreiro("Arthas", 120, 5),
            new Mago("Gandalf", 80, 10),
            new Arqueiro("Legolas", 100, 7),
            new Mago("Merlin", 90, 8),
            new Guerreiro("Kratos", 150, 12)
        };

        for (Personagem p : personagens) {
            p.atacar();
        }
    }
}
