# FiapDogRun

O FiapDogRun é um projeto desenvolvido em Java com o objetivo de simular o comportamento de um cachorro em relação ao seu nível de energia.

O sistema permite:

Criar objetos do tipo Cachorro

Adicionar energia ao cachorro

Simular corridas que consomem energia

Este projeto demonstra conceitos fundamentais de Programação Orientada a Objetos (POO).

- Conceitos de POO Aplicados

O projeto utiliza os seguintes conceitos:

- Classes

- Objetos

- Atributos

- Métodos

- Construtores

- Regras de negócio

- Encapsulamento básico

-Classe Cachorro
- O que a classe representa no mundo real?

A classe Cachorro representa um cachorro real.

Cada objeto criado a partir dessa classe representa um cachorro específico, com suas próprias características e nível de energia.

Exemplos de características:

Nome

Cor

Raça

Energia disponível

Assim como no mundo real, o cachorro pode:

- Recuperar energia (se alimentar)

- Gastar energia ao correr

- Estrutura da Classe
- Atributos
public String nome;
public String cor;
public String raca;
public int energia;
- Descrição dos atributos
Atributo	Descrição
nome	Nome do cachorro
cor	Cor do cachorro
raca	Raça do cachorro
energia	Quantidade de energia atual

- A energia inicia com valor 0.

- Construtor
public Cachorro(String nome, String cor, String raca)

O construtor é responsável por criar um novo objeto Cachorro.

Exemplo:
Cachorro cachorro1 = new Cachorro("Fernando", "Branco", "Shitzu");

Esse comando cria um cachorro com:

Nome: Fernando

Cor: Branco

Raça: Shitzu

Energia: 0

- Método adicionarEnergia()
- Função

Adiciona energia ao cachorro.

Código
public void adicionarEnergia(int valor)
- Como funciona

Recebe um valor inteiro

Verifica se o valor é positivo

Se for válido, adiciona à energia do cachorro

- Exemplo de uso
cachorro1.adicionarEnergia(50);
- Saída esperada
Energia restaurada: 50
- Regra de negócio

- Não é permitido adicionar energia zero ou negativa.

- Método correr()
- Função

Simula uma corrida que consome energia.

Código
public void correr(int custo)
- Como funciona

Recebe o custo da corrida

Verifica se o cachorro tem energia suficiente

Se tiver, reduz a energia

- Exemplo de uso
cachorro1.correr(20);
- Saída esperada
Corrida bem-sucedida. Energia restante: 30
- Exemplo Completo
Cachorro cachorro1 = new Cachorro("Fernando", "Branco", "Shitzu");

cachorro1.adicionarEnergia(50);
cachorro1.correr(20);

System.out.println(cachorro1.energia);
- Resultado final esperado
Energia restaurada: 50
Corrida bem-sucedida. Energia restante: 30
30
- Como o Projeto Demonstra POO
Conceito	Aplicação no Projeto
Classe	Modelo do cachorro
Objeto	Instância real criada no sistema
Atributos	Características do cachorro
Métodos	Ações do cachorro
Encapsulamento	Manipulação controlada da energia
- Conclusão

A classe Cachorro permite representar e controlar o estado de um cachorro dentro do sistema, incluindo sua energia e ações como correr e recuperar energia.

Cada objeto criado é independente e possui seus próprios valores, simulando corretamente o comportamento de múltiplos cachorros no mundo real.

- Possíveis Melhorias Futuras

Tornar os atributos private e usar getters/setters

Criar tratamento de exceções

Adicionar novos comportamentos (latir, dormir, brincar)

Criar interface gráfica

Implementar testes unitários
