package br.com.animais.petz.modelos;



public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println(getNome() +" diz: " + "Au au au!");
    }

    public void comer() {
        System.out.println(getNome() + "Comendo raçao!");
    }

    public void abanarRabo() {
        System.out.println(getNome() + " Abanando o rabo!" + " feliz em ver você!");
    }

    @Override
    public void inserirDadosAnimal() {
        System.out.println("Insira o nome: ");
        setNome(nome = sc.nextLine());
        System.out.println("Insira a raça:");
        setRaca(raca = sc.nextLine());
        System.out.println("Insira o peso: ");
        setPeso(peso = sc.nextLine());
    }

    @Override
    public void exibirInformacoesAnimal() {
        System.out.println("É um cachorro!");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Raça: " + this.getRaca());
    }
}