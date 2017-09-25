package classes;

public class Payment {

    private int idPayment;
    private int idService;
    private String paymentDate;
    private int idMonth;
    private double amount;

    public Payment() {
    }

    public Payment(int idPayment, int idService, String paymentDate, int idMonth, double amount) {
        this.idPayment = idPayment;
        this.idService = idService;
        this.paymentDate = paymentDate;
        this.idMonth = idMonth;
        this.amount = amount;
    }

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getIdMonth() {
        return idMonth;
    }

    public void setIdMonth(int idMonth) {
        this.idMonth = idMonth;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
    
}
