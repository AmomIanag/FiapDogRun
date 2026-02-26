package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Cachorro;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Cachorro cachorro1 = new Cachorro("Fernando", "Branco", "Shitzu");
        System.out.println("Regarga cachorro1");
        cachorro1.adicionarEnergia(49);

        Cachorro cachorro2 = new Cachorro("Amom", "Preto", "Pitbull");
        System.out.println("Regarga cachorro2");
        cachorro2.adicionarEnergia(56);
        
        System.out.println("--- Sistema FiapDogRun ---");
        System.out.println("Cachorro: " + cachorro1.nome + " | Energia: " + cachorro1.energia + " | Cor: " + cachorro1.cor + " | Raça: " + cachorro1.raça);
        System.out.println("Custo de energia da corrida");
        cachorro1.Correr(50);
     
        System.out.println("Cachorro: " + cachorro2.nome + " | Energia: " + cachorro2.energia + " | Cor: " + cachorro2.cor + " | Raça: " + cachorro2.raça);
        System.out.println("Custo de energia da corrida");
        cachorro2.Correr(50);

    }
}