import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite os valor do limite do cartão de crédito");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);


        int sair = 1;
        while(sair !=0){
            System.out.println("Digite a descrição da compra");
            String descrição = leitura.next();

            System.out.println("Digite o valor da compra");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descrição,valor);
            boolean comprafeita = cartao.lancaCompra(compra);

            if (comprafeita){
                System.out.println("Compra realizada!!!");
                System.out.println("Digite [0] para sair e [1] para continuar");
                sair = leitura.nextInt();
            }else {
                System.out.println("Saldo insuficiente");
                sair = 0;
            }
        }

        System.out.println("-----------------------");
        System.out.println("Compra realizadas: \n");
        Collections.sort(cartao.getCompras());
        System.out.println(cartao.getCompras());
        for (Compra c : cartao.getCompras()){
            System.out.println(c.getDescriçao() + "-" + c.getValor());
        }
        System.out.println("\n-----------------------");
        System.out.println("saldo do cartão: "+cartao.getSaldo());
    }
}
