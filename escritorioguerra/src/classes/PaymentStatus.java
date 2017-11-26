package classes;

public class PaymentStatus {
  
  private int idPayStatus;
  private String payStatus;

  public PaymentStatus() {
  }

  public PaymentStatus(int idPayStatus, String payStatus) {
    this.idPayStatus = idPayStatus;
    this.payStatus = payStatus;
  }

  public int getIdPayStatus() {
    return idPayStatus;
  }

  public void setIdPayStatus(int idPayStatus) {
    this.idPayStatus = idPayStatus;
  }

  public String getPayStatus() {
    return payStatus;
  }

  public void setPayStatus(String payStatus) {
    this.payStatus = payStatus;
  }
  
  
  
}
