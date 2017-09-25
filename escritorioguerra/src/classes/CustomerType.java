package classes;

public class CustomerType {

    private int idCustomerType;
    private String customerType;

    public CustomerType() {
    }

    public CustomerType(int idCustomerType, String customerType) {
        this.idCustomerType = idCustomerType;
        this.customerType = customerType;
    }

    public int getIdCustomerType() {
        return idCustomerType;
    }

    public void setIdCustomerType(int idCustomerType) {
        this.idCustomerType = idCustomerType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    
    
}
