public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Produto: " + this.nome + "(R$" + this.preco + ")";
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return this.getNome().compareTo(outroProduto.getNome());
    }
}
