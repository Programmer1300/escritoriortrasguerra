package classes;

public class Payment {

    private Customer customer;
    private Month month;
    private int year;
    private PaymentStatus payStatus;
    private int idPayment;
    private int idService;
    private String paymentDate;
    private double amount;

    public Payment() {
    }

    public Payment(Customer customer, Month month, 
                int idPayment, int idService, String paymentDate, double amount) {
        this.customer = customer;
        this.month = month;
        this.idPayment = idPayment;
        this.idService = idService;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStatus getPayStatus() {
      return payStatus;
    }

    public void setPayStatus(PaymentStatus payStatus) {
      this.payStatus = payStatus;
    }
    
}
