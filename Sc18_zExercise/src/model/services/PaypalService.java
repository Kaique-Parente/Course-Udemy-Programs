package model.services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public double paymentFee(double amount) {
        return amount + amount * 0.02; 
    }

    @Override
    public double interest(double amounth, int mounth) {
        return amounth + (amounth * 0.01) * mounth;
    }
}
