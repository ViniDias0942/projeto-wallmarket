public class Cartao {
    private double limite;

    public void InterfaceApp(){
        System.out.println("Limite atual: " + getLimite());
        System.out.println("Digite 2 para ver o historico de compras.");
        System.out.println("Digite 1 para incluir produto na lista.");
        System.out.println("Digite 0 para sair.");
    }



    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
}
