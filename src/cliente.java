/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class cliente {
    String nome;
    String cep;
    String cidade;
    String estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    //construtores
    public cliente (){
        
    }

    public cliente(String nome , String cep, String cidade, String estado) {
        this.nome = nome;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }
    public void imprimeCliente (){  
            System.out.println("----DADOS CLIENTE----");
            System.out.println(" O nome do cliente: "+this.nome+"\n o cep do cliente: "+this.cep+"\n a cidade do cliente: "+this.cidade+"\n o estado do cliente: "+this.estado);
        
    }
    
    
    
    //fim construtores
   //metodo toString rever depois;
    
    /*@Override
    public String toString (){
        System.out.println("----CLIENTE----");
        return "o nome do cliente é: "+nome+"\n o cep do cliente é: "+cep+"\n a cidade do cliente é: "+cidade+"\n e o estado do cliente é: "+estado ;
    }*/

}
