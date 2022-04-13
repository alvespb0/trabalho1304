/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class itemDeVenda {

    produto prod;
    int quantidade;

    /*  public produto getProduto() {
        return prod;
    }

    public void setProduto(produto prod) {
        this.prod = prod;
    }
     */
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //metodo de calcular o preço
    double calculapreco(){
        return getQuantidade() * prod.getPreco();
    }

    //metodo 2 imprimir item de venda
    public void imprimeItemDeVenda() {
        System.out.println("quantidade vendida do produto: " + quantidade);
        prod.imprimeProduto();
    }

    //construtores
    public itemDeVenda(produto prod, int quantidade) {
        this.prod = prod;
        this.quantidade = quantidade;
    }

    public itemDeVenda() {

    }
    //fim construtores
}
