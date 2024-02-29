public class e2 {
    
    public static void main(String[] args) {
        int quantidade_atual_estoque = 7;
        int quantidade_maxima_estoque = 20;
        int quantidade_minima_estoque = 4;

        int quantidade_media = (quantidade_maxima_estoque + quantidade_minima_estoque)/2;
        System.out.println("A quantidade média de estoque é de " + quantidade_media);

        if (quantidade_atual_estoque >= quantidade_media) {
            System.out.println("Não efetuar compra");
        }

        else {
            System.out.println("Efetuar compra");
        }
    }
}
