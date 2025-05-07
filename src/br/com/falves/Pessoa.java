/**
 * @author falvesmac
 */

package br.com.falves;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
  String nome;
  String sexo;

  public Pessoa(String nome, String sexo) {
    this.nome = nome;
    this.sexo = sexo;
  }

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    ArrayList<Pessoa> masc = new ArrayList<>();
    ArrayList<Pessoa> fem = new ArrayList<>();
    String opcao;

    System.out.println("Deseja adicionar uma nova pessoa? ");
    opcao = s.nextLine();

    while(opcao.equalsIgnoreCase("Sim")) {
      System.out.println("Digite o nome: ");
      String nome = s.nextLine();

      System.out.println("Digite o sexo (Masculino ou Feminino): ");
      String sexo = s.nextLine();

      if (!sexo.equalsIgnoreCase("Masculino") && !sexo.equalsIgnoreCase("Feminino")) {
        System.out.println("Sexo inválido, pessoa não adicionada! ");
        continue;
      }

      Pessoa novaPessoa = new Pessoa(nome, sexo);

      if (sexo.equalsIgnoreCase("masculino")) {
        masc.add(novaPessoa);
        System.out.println("Nome: " + nome + " | " + " sexo: " + sexo + "\nAdicionado com sucesso!");
      } else {
        fem.add(novaPessoa);
        System.out.println("Nome: " + nome + " | " + " sexo: " + sexo + "\nAdicionada com sucesso!");
      }

      System.out.println("Deseja adicionar outra pessoa? ");
      opcao = s.nextLine();
    }

    System.out.print("Obrigado");


    System.out.println("\nLista de pessoas do sexo masculino: ");
      for(Pessoa p : masc) {
        System.out.println("Nome: " + p.nome + " | " + "Sexo: " + p.sexo);
      }

    System.out.println("\nLista de pessoas do sexo feminino: ");
    for(Pessoa p : fem) {
      System.out.println("Nome: " + p.nome + " | " + "Sexo: " + p.sexo);
    }
  }

}