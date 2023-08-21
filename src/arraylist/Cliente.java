/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Cliente {
    String nome;
    String cpf;
    String cnpj;
    String email;
    String responsavel;
    String cidade;
    String estado;
    String endereco;
    String telefone;
    int qtdResiduos;
    double custoMensal;
    
    public Cliente (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    Cliente(){
//        throw new UnsupportedOperationException;
    }
    
    public String toString(){
    return ("\n Nome:" + this.nome + "\n CPF:" + this.cpf);
    }
}
