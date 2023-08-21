/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> lista = new ArrayList<>();

        int numero;
        do {
            System.out.println("|===========================|\n"
                    + " 0 - Sair\n"
                    + " 1 - Cadastrar cliente\n"
                    + " 2 - Exibir Clientes\n"
                    + " 3 - Buscar empresa\n"
                    + " 4 - Acrescentar insumos e custos\n"
                    + " 5 - Relatórios\n"
                    + "|===========================|");
            numero = sc.nextInt();
            switch (numero) {
                case 0:
                    System.out.println("Obrigado por utilizar");
                    break;

                case 1:
                    String nome,
                     cpf;
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Insira o nome:");
                        nome = sc.next();
                        System.out.println("Insira o cpf:");
                        cpf = sc.next();
                        lista.add(new Cliente(nome, cpf));
                    }
                    break;
                case 2:
                    int tamanhoLista = lista.size();
                    System.out.println("============= CLIENTES =============");
                    for (int i = 0; i < tamanhoLista; i++) {
                        System.out.printf("Código da empresa: %d: %s\n", (i + 1), lista.get(i));

                    }
                    break;
                case 3:
                    System.out.println("Insira o codigo da empresa da empresa");

                    int busca;
                    busca = sc.nextInt();
                    busca = busca - 1;
                    int i = 0;

                    for (Cliente cli : lista) {
                        if (busca == i) {
                            System.out.println("CLIENTE NUMERO "+ (i+1));
                            System.out.println(cli);
                        }
                        
                        i++;
                    }
                    break;
                default:
                    System.out.println("Numero invalido");
            }
        } while (numero != 0);

    }

}
