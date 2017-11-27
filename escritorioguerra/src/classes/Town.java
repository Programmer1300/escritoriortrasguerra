package classes;

public class Town extends Township {

  private int idTown;
  private String townName;

  public Town() {
  }
  
  public Town(int idTown, String townName, int idTownship) {
    this.idTown = idTown;
    this.townName = townName;
    super.setIdTownship(idTownship);
  }

  public int getIdTown() {
    return idTown;
  }

  public void setIdTown(int idTown) {
    this.idTown = idTown;
  }

  public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  @Override
  public String toString() {
    return townName;
  }
  
}
