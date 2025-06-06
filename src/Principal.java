import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 1;

        System.out.println("Digite seu limite: ");
        double limite = scanner.nextDouble();
        Cartao cartao = new Cartao();
        cartao.setLimite(limite);
        List<Produto> listaDeProdutos = new LinkedList<>();

        while (escolha != 0) {
            cartao.InterfaceApp();
            escolha = scanner.nextInt();
            scanner.nextLine();
            if (escolha > 2 || escolha < 0){
                System.out.println("Operação inválida!!");
            } else if (escolha == 1) {
                System.out.println("Nome do produto: " );
                String Nomeproduto = scanner.nextLine();

                System.out.println("Valor do produto: " );
                double precoProduto = scanner.nextDouble();
                if (precoProduto > limite) {
                    System.out.println("Sem limite!");
                } else {
                    limite -= precoProduto;
                    cartao.setLimite(limite);
                    Produto produto = new Produto(Nomeproduto, precoProduto);
                    listaDeProdutos.add(produto);
                }
            } else if (escolha == 2){
                for (Produto elementoDaLista : listaDeProdutos){
                    System.out.println(elementoDaLista);
                }
            }
        }
        System.out.println("Resumo de compras: ");
        Collections.sort(listaDeProdutos);
        for (Produto elementoDaLista : listaDeProdutos){
            System.out.println(elementoDaLista);
        }
    }
}
