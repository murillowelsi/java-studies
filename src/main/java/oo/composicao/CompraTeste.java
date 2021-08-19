package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();

        c1.cliente = "Pedro";
        c1.addItem("Caneta", 20, 3.50);
        c1.addItem("Lapis", 2, 1.50);
        c1.addItem("Borracha", 1, 3.00);

        System.out.println("O valor total da sua compra é de: R$" + c1.getValorTotal());

        // Só para mostrar a relaçao bi-direcional
        double total = c1
                .itens.get(0).compra
                .itens.get(1).compra
                .getValorTotal();
        System.out.println("O valor total da sua compra é de: R$" + total);
    }
}
