package application;

import entities.Order;
import entities.enums.OrderStatus;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(180, new Date(), OrderStatus.DELIVERED);
        
        OrderStatus ord1 = OrderStatus.DELIVERED;
        
        OrderStatus ord2 = OrderStatus.valueOf("SHIPPED");
        
        System.out.println(order);
        System.out.println(ord1);
        System.out.println(ord2);
    }
}
