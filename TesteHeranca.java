public class TesteHeranca {
    public static void main(String[] args) {
        B objeto1 = new B(10, 20, 60,80);

        objeto1.imprimeValores(); //chamamos os dois métodos diretamente no objeto da classe B
    }                               // sobrepondo o método de mesmo nome da superclasse
}
