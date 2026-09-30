import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {

    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = saldo;
        this.compras = new ArrayList<>();
    }


    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public boolean lancaCompra(Compra compra){
        if (this.saldo > compra.getValor()){
            saldo -= compra.getValor();
            this.compras.add(compra);
        }

        return false;


    }
}
