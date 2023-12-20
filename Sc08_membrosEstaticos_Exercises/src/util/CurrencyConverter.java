
package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    
    public static double calculator(double dollarPrice, double dollarsBought) {
        return (dollarPrice * dollarsBought) + (dollarPrice * dollarsBought * IOF) ;
    }
}
