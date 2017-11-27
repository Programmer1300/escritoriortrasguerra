package classes;

public class Township extends Department {

  private int idTownship;
  private String townshipName;

  public Township() {
  }

  public Township(int idTownship, String townshipName, int idDepto) {
    this.idTownship = idTownship;
    this.townshipName = townshipName;
    super.setIdDepto(idDepto);
  }

  public int getIdTownship() {
    return idTownship;
  }

  public void setIdTownship(int idTownship) {
    this.idTownship = idTownship;
  }

  public String getTownshipName() {
    return townshipName;
  }

  public void setTownshipName(String townshipName) {
    this.townshipName = townshipName;
  }

  @Override
  public String toString() {
    return townshipName;
  }
  
}
