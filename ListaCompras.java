import java.util.ArrayList;

public class ListaCompras{
    public static void main(String[] args) {
        ArrayList<String> carrinho = new ArrayList<>();

        System.out.println("=======================================================");
        System.out.println("            L I S T A  D E  P R O D U T O S            ");
        System.out.println("=======================================================");

        carrinho.add("Notebook");
        carrinho.add("Mouse");
        carrinho.add("Teclado");
        carrinho.add("Monitor");

        System.out.println("=== O Primeiro Produto é: " + carrinho.get(0) + "                  ===");
        System.out.println();
        System.out.println("          " + carrinho);
        System.out.println();
        System.out.println("=== O Último Produto é: " + carrinho.get(carrinho.size()-1) + "                     ===");
        System.out.println();
        carrinho.remove("Mouse");
        System.out.println("=== Removendo o mouse: " + carrinho + " ===");
        System.out.println("=======================================================");
        System.out.println("Total de Produtos: " + carrinho.size());
    } 
    
}