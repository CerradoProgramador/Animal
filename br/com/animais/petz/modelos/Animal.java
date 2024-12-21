package br.com.animais.petz.modelos;

import java.util.Scanner;

public class Animal {
    protected String nome;
    protected String peso;
    protected String raca;

    Scanner sc = new Scanner(System.in);


    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void emitirSom() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void inserirDadosAnimal() {
        System.out.println("Insira o nome do Animal: ");
        setNome(nome = sc.nextLine());
        System.out.println("Insira o peso do Animal: ");
        setPeso(peso = sc.nextLine());
        System.out.println("Insira a raça do Animal: ");
        setRaca(raca = sc.nextLine());
    }

    public void exibirInformacoesAnimal() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Raça: " + this.getRaca());
    }
}