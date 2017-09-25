package classes;

import java.util.ArrayList;

public class Customer {

    private int idCustomer;
    private String customerName;
    private String customerLastName;
    private int nit;
    private int phone;
    private ArrayList<Service> csServices = new ArrayList<>();
    private Service customerService;

    public Customer() {
    }

    public Customer(int idCustomer, String customerName, String customerLastName, int nit, int phone) {
        this.idCustomer = idCustomer;
        this.customerName = customerName;
        this.customerLastName = customerLastName;
        this.nit = nit;
        this.phone = phone;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public ArrayList<Service> getCsServices() {
        return csServices;
    }

    public void setCsServices(ArrayList<Service> csServices) {
        this.csServices = csServices;
    }

    public Service getCustomerService() {
        return customerService;
    }

    public void setCustomerService(Service customerService) {
        this.customerService = customerService;
    }

    @Override
    public String toString() {
        return "Customer{" + "idCustomer=" + idCustomer + ", customerName=" + customerName + ", customerLastName=" + customerLastName + ", nit=" + nit + ", phone=" + phone + ", csServices=" + csServices + ", customerService=" + customerService + '}';
    }
    
}
