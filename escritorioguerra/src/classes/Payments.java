
package classes;

public class Payments {
    private int ID_custumer;
    private int ID_service;
    private String name;
    private int phone;
    private double fee;
    private String direccion;
    private String voucher_name;
    private String type_custumer;
    private String estado;
    private int ID_status;
    private int ID_town;
    private int id_payment_status;

    public int getID_custumer() {
        return ID_custumer;
    }

    public void setID_custumer(int ID_custumer) {
        this.ID_custumer = ID_custumer;
    }

    public int getID_service() {
        return ID_service;
    }

    public void setID_service(int ID_service) {
        this.ID_service = ID_service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getVoucher_name() {
        return voucher_name;
    }

    public void setVoucher_name(String voucher_name) {
        this.voucher_name = voucher_name;
    }

    public String getType_custumer() {
        return type_custumer;
    }

    public void setType_custumer(String type_custumer) {
        this.type_custumer = type_custumer;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getID_status() {
        return ID_status;
    }

    public void setID_status(int ID_status) {
        this.ID_status = ID_status;
    }

    public int getID_town() {
        return ID_town;
    }

    public void setID_town(int ID_town) {
        this.ID_town = ID_town;
    }

    public int getId_payment_status() {
        return id_payment_status;
    }

    public void setId_payment_status(int id_payment_status) {
        this.id_payment_status = id_payment_status;
    }
    

}
