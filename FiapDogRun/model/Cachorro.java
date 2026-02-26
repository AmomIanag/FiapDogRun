package br.com.fiapride.model;

// A Classe define a estrutura. Ela não é o passageiro real, é apenas o modelo.
public class Cachorro {
    // Atributos (Características)
    public String nome;
    public String cor;
    public String raça;
    public int energia;
    
    public Cachorro (String nome, String cor, String raça) {
        this.nome = nome;
        this.cor = cor; // Novo Atributo
        this.raça = raça;
        this.energia = 0;
    }

    public void adicionarEnergia(int valor) {
        // Regra de negócio: O valor da recarga deve ser positivo
        if (valor <= 0) {
            System.out.println("Erro: Essa quantidade de energia é insuficiente.");
            return; // Interrompe a execução do método
        }
        this.energia += valor;
        System.out.println("Energia restaurada: " + this.energia);
    }
    
    public void Correr(int custo) {
        // Regra de negócio: O custo deve ser positivo e o saldo deve ser suficiente
        if (custo <= 0) {
            System.out.println("Erro: O custo da corrida é inválido.");
            return;
        }
        if (this.energia < custo) {
            System.out.println("Erro: O cachorro está com energia insuficiente.");
            return;
        }
        this.energia -= custo;
        System.out.println("Corrida bem-sucedida. Energia restante: " + this.energia);
    }
}