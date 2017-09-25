package classes;

public class Service extends Town {

    private int idService;
    private int idCustomer;
    private double fee;
    private int idCustomerType;
    private int idVoucher;
    private int idStatus;
    private String streetAvenue;
    private String houseNumber;
    private int zone;
    private String observations;

    public Service() {
    }

    public Service(int idService, int idCustomer, double fee, int idCustomerType, int idVoucher, int idStatus, String streetAvenue, String houseNumber, int zone, int idTown, String observations) {
        this.idService = idService;
        this.idCustomer = idCustomer;
        this.fee = fee;
        this.idCustomerType = idCustomerType;
        this.idVoucher = idVoucher;
        this.idStatus = idStatus;
        this.streetAvenue = streetAvenue;
        this.houseNumber = houseNumber;
        this.zone = zone;
        this.observations = observations;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getIdCustomerType() {
        return idCustomerType;
    }

    public void setIdCustomerType(int idCustomerType) {
        this.idCustomerType = idCustomerType;
    }

    public int getIdVoucher() {
        return idVoucher;
    }

    public void setIdVoucher(int idVoucher) {
        this.idVoucher = idVoucher;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getStreetAvenue() {
        return streetAvenue;
    }

    public void setStreetAvenue(String streetAvenue) {
        this.streetAvenue = streetAvenue;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
   
    
}
