package application;


public class Program {
    public static long flippingBits(long n) {
        return (long)Math.pow(2,32) + (~n);

    }
}
