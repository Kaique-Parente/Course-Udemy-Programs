package application;



public class Program {
    public static String timeConversion(String s) {
        
        String[] fields = s.split(":");
        
        String horas = fields[0];
        String minutos = fields[1];
        String aux = fields[2];
        
        String segundos = aux.substring(0, aux.length() - 2);
        
        if(s.contains("AM") && horas.contains("12")) {
            horas = "00";
        }
        if(s.contains("PM") && horas.contains("12")) {
            horas = "12";
        } else if (s.contains("PM")) {
            int valor = Integer.parseInt(horas);
            valor += 12;
            horas = valor + "";
        }
        
        return horas+":"+minutos+":"+segundos;

    }
}
