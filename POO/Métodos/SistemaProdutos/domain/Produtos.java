import domain;

public class Produtos {
    public double subtotalCompra(double produto1, double produto2, double produto3) {
        return produto1 + produto2 + produto3;
    }

    public double descontoCompra(double subtotal) {
        if (subtotal >= 200) {
            return subtotal * 0.10;
        } else {
            return 0.0;
        }
    }

    public double totalCompra(double subtotal, double desconto) {
        return subtotal - desconto;
    }
}