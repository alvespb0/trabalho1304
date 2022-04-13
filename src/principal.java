
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author IFSC
 */
public class principal {

    public static void main(String[] args) {
        double total;
        int teste;
        Scanner leia = new Scanner(System.in);
        venda v = new venda();
        cliente c = new cliente();
        produto p = new produto();
        itemDeVenda iv = new itemDeVenda();
        String nome;

        ArrayList<cliente> ListaCliente = new ArrayList<>();
        ArrayList<produto> ListaProduto = new ArrayList<>();
        ArrayList<itemDeVenda> ListaItens = new ArrayList<>();
        ArrayList<venda> ListaVenda = new ArrayList<>();

        do {
            System.out.println("====digite o numero====");
            System.out.println("1: cadastrar cliente");
            System.out.println("2: cadastrar produto");
            System.out.println("3: efetuar a venda");
            System.out.println("4: relatorio");
            System.out.println("5: sair do menu");
            teste = leia.nextInt();

            switch (teste) {
                case 1:

                    System.out.println("digite seu cep: ");
                    c.setCep(leia.next());
                    System.out.println("digite seu nome: ");
                    c.setNome(leia.next());
                    System.out.println("digite sua cidade: ");
                    c.setCidade(leia.next());
                    System.out.println("digite seu estado: ");
                    c.setEstado(leia.next());
                    ListaCliente.add(c);

                    break;
                case 2:
                    System.out.println("digite o codigo do produto: ");
                    p.setCodigo(leia.nextInt());
                    System.out.println("digite a descrição do produto: ");
                    p.setDescricao(leia.next());
                    System.out.println("digite o peso do produto: ");
                    p.setPeso(leia.nextDouble());
                    System.out.println("digite o preço do produto: ");
                    p.setPreco(leia.nextDouble());
                    ListaProduto.add(p);

                    break;
                case 3:
                    System.out.println("----efetuar venda----");
                    System.out.println("digite a data de hoje: ");
                    v.setData(leia.next());
                    System.out.println("Digite qual cliente");
                    nome= leia.next();
                    
                    for(cliente cli1 : ListaCliente){
                         if(nome.equalsIgnoreCase(cli1.getNome())){
                             System.out.println("cliente ja existente! parabens");
                         }
                    }
                    System.out.println("digite a quantidade do produto é ");
                    iv.setQuantidade(leia.nextInt());

                    System.out.println("Total até agora: : " + (iv.getQuantidade() * p.getPreco()));

                    ListaItens.add(iv);

                    venda vv = new venda(c, v.getData(), ListaItens);

                    ListaVenda.add(v);
                    break;
                case 4:

                    /*for (itemDeVenda ivv : ListaItens) {
                        ivv.imprimeItemDeVenda();
                    }*/

                    /*for (venda v1 : ListaVenda) {
                        v1.imprimirVenda();
                    }*/
                    for (cliente cli : ListaCliente) {
                        cli.imprimeCliente();
                    }
                    v.imprimirVenda();
                    for (produto p1 : ListaProduto) {
                        p1.imprimeProduto();
                    }
                    break;
                case 5:
                    break;
            }
        } while (teste < 5);
    }
}
