public class TestaConta {
    public static void main(String[] args) {  //a classe que possui esse 'main ags' é o local em que o método
        ContaCorrente minhaConta = new ContaCorrente(1000, 8956);  //será instanciado para ser executado

        minhaConta.alterarLimite(1500);
        System.out.println("Conta nº: " + minhaConta.obterNumero());
        System.out.println("Limite: " + minhaConta.consultarLimite());
        System.out.println("Saldo Total: " + minhaConta.consultarSaldoTotal());


        //DEPÓSITO
        minhaConta.depositar(3000);
        System.out.println("Conta nº: " + minhaConta.obterNumero());
        System.out.println("Limite: " + minhaConta.consultarLimite());
        System.out.println("Saldo Total: " + minhaConta.consultarSaldoTotal());

        //SAQUE
       if (minhaConta.sacar(800)) { //é o mesmo que colocar 'if (minhaConta.sacar(800) == true)'
           System.out.println(" ");
           System.out.println("Conta nº: " + minhaConta.obterNumero());
           System.out.println("Limite: " + minhaConta.consultarLimite());
           System.out.println("Saldo Total: " + minhaConta.consultarSaldoTotal());
       }

       else {
           System.out.println("Não foi possível realizar o saque. Saldo total da conta é de: " + minhaConta.consultarSaldoTotal());
       }

}

}
