import java.util.Scanner;
public class e1 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quantas maças você deseja comprar?");
        int quantidades = input.nextInt();

        if (quantidades < 12) {
            double preco = 1.30;
            double total = quantidades * preco;
            System.out.println("O custo total da compra foi de " + total + " R$"); 
        }

        else {
            double preco = 1;
            double total = quantidades * preco;
            System.out.println("O custo total da compra foi de " + total + " R$");

        }
    }
}