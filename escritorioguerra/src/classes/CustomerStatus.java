package classes;

public class CustomerStatus {

    private int idCustomerStatus;
    private String customerStatus;

    public CustomerStatus() {
    }

    public CustomerStatus(int idCustomerStatus, String customerStatus) {
        this.idCustomerStatus = idCustomerStatus;
        this.customerStatus = customerStatus;
    }

    public int getIdCustomerStatus() {
        return idCustomerStatus;
    }

    public void setIdCustomerStatus(int idCustomerStatus) {
        this.idCustomerStatus = idCustomerStatus;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }
    
}
