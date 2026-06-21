public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 08.5;

        if(valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println ("Saque realizado no valor de R$ " + valorSolicitado);
        } else {
            System.out.println("Saldo insuficiente. Digite um novo valor");
            
        }

        

    }
}
