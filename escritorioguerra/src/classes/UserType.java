package classes;

public class UserType {

  private int idUserType;
  private String userType;

  public UserType() {
  }

  public UserType(int idUserType, String userType) {
    this.idUserType = idUserType;
    this.userType = userType;
  }

  public int getIdUserType() {
    return idUserType;
  }

  public void setIdUserType(int idUserType) {
    this.idUserType = idUserType;
  }

  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }
  
  
}
