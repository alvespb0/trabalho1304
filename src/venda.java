/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
import java.util.ArrayList;
public class venda {
    double total;
    cliente cli;
    ArrayList<itemDeVenda> item1 = new ArrayList<>();
    String data;
    produto prod;
    itemDeVenda iv;
    
    
    
    
    public cliente getCli() {
        return cli;
    }

    public void setCli(cliente cli) {
        this.cli = cli;
    }

    public ArrayList<itemDeVenda> getItem1() {
        return item1;
    }

    public void setItem1(ArrayList<itemDeVenda> item1) {
        this.item1 = item1;
    }

   
    
    
    
    public produto getProd() {
        return prod;
    }

    /*public ArrayList<String> getItem() {
    return item;
    }
    //.
    public void setItem(ArrayList<String> item) {
    this.item = item;
    }*/
    public void setProd(produto prod) {    
        this.prod = prod;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public venda(cliente cli, String data, ArrayList<itemDeVenda> item1) {
        this.cli = cli;
        this.data = data;
        this.item1 = item1;
    }
    
    public venda (){
        
    }
    
    /* nao sei o que deu de errado
    public double calculartotaldavenda (){
        double soma = 0;
        double teste = 0;
        for (itemDeVenda iv2 : item1){
           soma += iv.calculapreco(); 
           teste += iv.getQuantidade()*prod.getPreco();
        }
        
        return teste;
   }*/

    
    
     void imprimirVenda (){
         System.out.println("----DADOS VENDA----");
         System.out.println("teste1: "+(iv.getQuantidade()*prod.getPreco()));
        System.out.println("a data da venda é: "+data+"\n" );
    }
    
    
    
    
    
}
