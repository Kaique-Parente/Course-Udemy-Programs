package model.services;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(double amounth, int mounth);
}
