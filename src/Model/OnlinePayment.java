package Model;

public class OnlinePayment implements Payment {
    String transactionID;
    String paymentGateaway;

    public OnlinePayment(String transactionID, String paymentGateaway) {
        this.transactionID = transactionID;
        this.paymentGateaway = paymentGateaway;
    }
    
    public String getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }
    public String getPaymentGateaway() {
        return paymentGateaway;
    }
    public void setPaymentGateaway(String paymentGateaway) {
        this.paymentGateaway = paymentGateaway;
    }
    @Override
    public void makePayment(double amount) {
        System.out.println("Membayar sebesar " + amount + " melalui " + paymentGateaway);
        System.out.println("ID Transaksi: " + transactionID);
    }
}
