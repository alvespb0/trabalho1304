/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class produto {

    double codigo;
    double peso;
    double preco;
    String descricao;
    
    
//getters e setters
    
    
    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
//fim dos getters e setters
    //metodo para imprimir informação dos produto
    public void imprimeProduto() {
        System.out.println("----DADOS PRODUTOS----");
        System.out.println("o codigo do produto é: " + codigo + "\n a descrição do produto é: " + descricao + "\n o peso do produto é: " + peso + "\n e o preço do produto é: " + preco);
    }

    //construtores
    public produto(String descricao, double peso, double preco, double codigo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.peso = peso;
        this.preco = preco;
    }

    public produto() {

    }
    //fim construtores

}
