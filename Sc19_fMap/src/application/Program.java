package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import model.entities.Product;

public class Program {
    public static void main(String[] args) {
        
       Map<String, Double> stock = new HashMap<>();
       
       Scanner sc = new Scanner(System.in);
       
       /*
       Product p1 = new Product("Tv", 900.00);
       Product p2 = new Product("Notebook", 2300.00);
       Product p3 = new Product("Tablet", 1500.00);
       
       stock.put(p1, 4.00);
       stock.put(p2, 2000.00);
       stock.put(p3, 15000.00);
       */
       
       stock.put("Tv", 4.0);
       
        System.out.print("Adicionar itens? ");
        char resposta = sc.next().charAt(0);
        sc.nextLine();
        if(resposta == 's') {
            System.out.print("Digite o Produto: ");
            String name = sc.nextLine();
            
            System.out.print("Quantidade total: ");
            double n = sc.nextInt();
            
            stock.put(name, n);
            System.out.println("");
            System.out.println("Atualização do Produto:");
            System.out.println("Nome: " + name + "\nQuantidade no Estoque: " + stock.get(name));
        }
       
       //System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
