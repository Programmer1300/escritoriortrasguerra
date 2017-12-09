package classes;

public class User extends UserType {

  private int idSession;
  private String username;
  private String pass;
  private int usstatus;

  public User() {
  }

  public User(String username, String pass, int usstatus) {
    this.username = username;
    this.pass = pass;
    this.usstatus = usstatus;
  }

  public User(int idSession, String username, String pass, int idUserType, int usstatus) {
    this.idSession = idSession;
    this.username = username;
    this.pass = pass;
    this.usstatus = usstatus;
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
   public int getUsstatus() {
        return usstatus;
    }

    public void setUsstatus(int usstatus) {
        this.usstatus = usstatus;
    }

}
