public class Loja {
    public static void main(String[] args) {
        calcularEExibirPrecoFinal("Celular", 2000.0, 0.10);
        calcularEExibirPrecoFinal("Notebook", 4500.0, 0.15);
        calcularEExibirPrecoFinal("Tablet", 1500.0, 0.05);
    }

    private static void calcularEExibirPrecoFinal(String produto, double preco, double percentualDesconto) {
        double desconto = preco * percentualDesconto;
        double precoFinal = preco - desconto;
        System.out.println(produto + " - Preço final: R$ " + precoFinal);
    }
}
