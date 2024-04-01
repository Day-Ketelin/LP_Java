public class A {
    protected int x, y; //protegidos - mas podem aparecer em uma subclasse
    private int z; //privados - podem ser acessados somente na mesma classe

    public A(int a, int b, int c) { //por ter o mesmo nome da classe, esse é o construtor
        this.x = a;
        this.y = b;
        this.z = c;

    }

    //GETS
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() { ///se colocar o void, quer dizer que não retorna nada
        return this.z;  //nesse caso, não precisa do 'return'
    }

    public void setX(int a)   {
        this.x = a;
    }

    //SETS
    public void setY(int b) {
        this.y = b;
    }

    public void setZ(int c) {
        this.z = c;  //o 'this.z' recebe o que está sendo passado pelo parâmetro na linha de cima (int c)
    }

    public void imprimeValores() {
        System.out.println("X = " + this.x); //poderia ser também o "getX"
        System.out.println("Y = " + this.y);
        System.out.println("Z = " + this.z);
    }

}
