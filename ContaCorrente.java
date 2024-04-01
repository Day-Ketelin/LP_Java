public class ContaCorrente extends Conta {

    double limite;

    public ContaCorrente(double l, long n) { //demos o nome do limite como l
        super(n);
        if (l > 0) //colocamos uma condição para mostrar o limite, que não pode ser negativo
            this.limite = l;

    }

    public void alterarLimite(double l) {
        if (l > 0)
            this.limite = l;
    }

    public double consultarLimite() { //limite incluindo saldo negativo (cheque-especial)
        return this.limite;
    }

    public double consultarSaldoTotal() {
        return (this.saldo + this.limite); //o saldo veio herdado da classe 'Conta'
    }


}
