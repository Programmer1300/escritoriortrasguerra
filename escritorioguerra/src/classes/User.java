package classes;

public class User extends UserType {

  private int idSession;
  private String username;
  private String pass;

  public User() {
  }

  public User(String username, String pass) {
    this.username = username;
    this.pass = pass;
  }

  public User(int idSession, String username, String pass, int idUserType) {
    this.idSession = idSession;
    this.username = username;
    this.pass = pass;
    super.setIdUserType(idUserType);
  }

  public int getIdSession() {
    return idSession;
  }

  public void setIdSession(int idSession) {
    this.idSession = idSession;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }
  
  
  
}
