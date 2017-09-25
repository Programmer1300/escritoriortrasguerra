package classes;

public class Department {

    private int idDepto;
    private String deptoName;

    public Department() {
    }

    public Department(int idDepto, String deptoName) {
        this.idDepto = idDepto;
        this.deptoName = deptoName;
    }

    public int getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(int idDepto) {
        this.idDepto = idDepto;
    }

    public String getDeptoName() {
        return deptoName;
    }

    public void setDeptoName(String deptoName) {
        this.deptoName = deptoName;
    }
    
    
}
