public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 3500.00, 5);
        p.exibirInfo();
        p.setPreco(-100); // deve manter 0
        p.setQuantidade(10);
        p.exibirInfo();
    }
}