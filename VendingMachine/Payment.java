package lld.VendingMachine;

public class Payment {
    private int id ;
    private PaymentType paymentType;
    private double amount;
    public Payment(PaymentType paymentType,int id,double amount){
        this.id=id;
        this.amount=amount;
        this.paymentType=paymentType;
    }

    public double getAmount(){
        return amount;
    }

    public PaymentType getPaymentType(){
        return paymentType;
    }
}
