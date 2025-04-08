public class Loja {
    public static void main(String[] args) {
        String produto1 = "Celular";
        double preco1 = 2000.0;
        double desconto1 = preco1 * 0.10; // 10% de desconto
        double precoFinal1 = preco1 - desconto1;
        System.out.println(produto1 + " - Preço final: R$ " + precoFinal1);

        String produto2 = "Notebook";
        double preco2 = 4500.0;
        double desconto2 = preco2 * 0.15; // 15% de desconto
        double precoFinal2 = preco2 - desconto2;
        System.out.println(produto2 + " - Preço final: R$ " + precoFinal2);

        String produto3 = "Tablet";
        double preco3 = 1500.0;
        double desconto3 = preco3 * 0.05; // 5% de desconto
        double precoFinal3 = preco3 - desconto3;
        System.out.println(produto3 + " - Preço final: R$ " + precoFinal3);
    }

       
}
