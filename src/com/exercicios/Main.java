package com.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>(5);
        System.out.println("\nVamos cadastrar pessoas\n");
        for(int i=0;i <5;i++) {
            System.out.println("Digite o NOME da pessoa " + (i+1));
            String nome = sc.next();
            System.out.println("Digite a IDADE da pessoa " + (i+1));
            int idade = sc.nextInt();
            pessoas.add(new Pessoa(nome, idade));
        }

        int idadeMin = 0;
        int idadeMax = 0;
        int mediaIdade = 0;
        int somaIdades = 0;
        String pessoaIdadeMin = "";
        String pessoaIdadeMax = "";

        for(int i=0;i < pessoas.size();i++) {
            somaIdades = somaIdades + pessoas.get(i).getIdade();
            if (idadeMin == 0) {
                idadeMin = pessoas.get(i).getIdade();
                pessoaIdadeMin = pessoas.get(i).getNome();
                idadeMax = pessoas.get(i).getIdade();
                pessoaIdadeMax = pessoas.get(i).getNome();
            }
            if (pessoas.get(i).getIdade() < idadeMin) {
                idadeMin = pessoas.get(i).getIdade();
                pessoaIdadeMin = pessoas.get(i).getNome();
            }
            if (pessoas.get(i).getIdade() > idadeMax){
                idadeMax = pessoas.get(i).getIdade();
                pessoaIdadeMax = pessoas.get(i).getNome();
            }
            System.out.println(pessoas.get(i));
        }
        mediaIdade = somaIdades / pessoas.size();
        System.out.println("A Pessoa mais velha é " + pessoaIdadeMax + ". Sua idade é de " + idadeMax + " anos\n");
        System.out.println("A Pessoa mais nova é " + pessoaIdadeMin + ". Sua idade é de " + idadeMin + " anos\n");
        System.out.println("A média de idade entre todas as pessoas cadastradas é de  " + mediaIdade + " anos\n");
    }
}
