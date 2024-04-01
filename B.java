public class B extends A { //o extends indica que a classe B herda a classe A

    private int k;

    public B(int a, int b, int c, int d) {
        super (a, b, c); //com o parâmetro "super", chamamos o construtor da superclasse
        this.k = d;
    }

    public void imprimeValores() {  //quando criamos dois métodos de mesmo nome, geramos 'overloads'
        System.out.println("X = " + this.x);
        System.out.println("Y = " + this.y);
        System.out.println("K = " + this.k);
        System.out.println("Z = NÃO VISÍVEL (PRIVATE)."); //como o Z é private não pode ser chamado diretamente
        System.out.println("Z = " + getZ()); //Chamamos então de modo indireto, pelo 'getZ()'
    }

}
