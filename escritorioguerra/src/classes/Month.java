package classes;

public class Month {

    private int idMonth;
    private String monthName;

    public Month() {
    }

    public Month(int idMonth, String monthName) {
        this.idMonth = idMonth;
        this.monthName = monthName;
    }

    public int getIdMonth() {
        return idMonth;
    }

    public void setIdMonth(int idMonth) {
        this.idMonth = idMonth;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }
    
}
