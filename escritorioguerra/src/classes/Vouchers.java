package classes;

public class Vouchers {
    
    private int idVoucher;
    private String voucherName;

    public Vouchers() {
    }

    public Vouchers(int idVoucher, String voucherName) {
        this.idVoucher = idVoucher;
        this.voucherName = voucherName;
    }

    public int getIdVoucher() {
        return idVoucher;
    }

    public void setIdVoucher(int idVoucher) {
        this.idVoucher = idVoucher;
    }

    public String getVoucherName() {
        return voucherName;
    }

    public void setVoucherName(String voucherName) {
        this.voucherName = voucherName;
    }
    
    
}
