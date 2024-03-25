package application;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
       
        List <Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        
        int total=0, aux=0, min=0, max=arr.get(0);
        
        for(int item : arr) {
            total += item;
        }
        
        min = total;
        
        for(int i=0; i < 5; i++){
            aux=total;
            aux = aux - arr.get(i);
            if(aux > max) {
                max = aux;
            }
            if(aux < min) {
                min = aux;
            }
        }
        
        System.out.println(min + " " + max);
    }
}
