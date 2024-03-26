package application;

import java.util.List;



public class Program {
    public static int lonelyinteger(List<Integer> a) {
        
        int resultado = 0;
        
        for (int item : a){
            if(a.stream().filter(valor -> valor == item).count() == 1L) {
                resultado = item;
                break;
            }
        }
        
        return resultado;
    }
}
