package application;

public class Program {

    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the prize";
        System.out.println(pangrams(s));
    }
    
    public static String pangrams(String s) {

        String msg = "pangram";
        s = s.replace(" ", "");

        int letras[] = new int[26];
        int pos = 0;

        for (int i = 0; i < s.length(); i++) {
            pos = (int) (s.toUpperCase().charAt(i) - 65);

            letras[pos]++;
        }

        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == 0) {
                msg = "not pangram";
            }
        }

        return msg;
    }
}
