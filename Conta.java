public class Conta {
    long numero;
    double saldo;

    public Conta (long n) {
        this.numero = n; //inicializamos a conta
        this.saldo = 0; //com saldo 0
    }

    public void depositar(double valor) {
        if (valor > 0) //como é só uma linha, não é necessário colocar uma chave no parâmetro do 'if'
            this.saldo = this.saldo + valor;
            System.out.println("Depósito efetuado!" + "\n");
    }

    public boolean sacar(double valor) {
        if (valor > 0 && ((saldo - valor) >= 0 )) { //se condição1 e "&&" condição2
            this.saldo = this.saldo - valor; //o saldo retorna o saldo - o valor, para ter o retorno da condição definida

            return true;
        }
        else return false;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public long obterNumero() {
        return this.numero; //retorna o número da conta
    }


}
