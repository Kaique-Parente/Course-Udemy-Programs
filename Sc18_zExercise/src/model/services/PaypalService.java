package model.services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public double paymentFee(double amount) {
        return amount * 0.02; 
    }

    @Override
    public double interest(double amounth, int mounth) {
        return amounth + 0.01 * mounth;
    }
}
