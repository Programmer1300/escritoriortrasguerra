package Controloador;

import classes.Customer;
import dao.CustomerDao;
import dao.PaymentsDAO;

public class Task {

    private CustomerDao csDao = new CustomerDao();
    private PaymentsDAO payDao = new PaymentsDAO();
    
    public void setMonthlyDueBills() {
        String query = "SELECT * FROM payments_info";
        
        for (Customer customer : csDao.getCustomers(query)) {
            int payStatus;
            
            if (customer.getCustomerService().getIdStatus() == 1) {
                payStatus = 1; //Si el cliente está activo, "No Pagado".
            } else {
                payStatus = 4; //Si el cliente está inactivo, "No Aplica".
            }

            payDao.setPaymentStatus(
                    customer.getCustomerService().getIdService(), 
                    customer.getCustomerService().getFee(), 
                    payStatus
            );       
        }
        
    }
    
}
