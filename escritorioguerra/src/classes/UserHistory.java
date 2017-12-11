package classes;

public class UserHistory {

    private int idUserHistory;
    private User user;
    private String date;
    private String time;
    private String url;

    public UserHistory() {
    }

  public UserHistory(int idUserHistory, User user, String date, String time, String url) {
    this.idUserHistory = idUserHistory;
    this.user = user;
    this.date = date;
    this.time = time;
    this.url = url;
  }

  public int getIdUserHistory() {
    return idUserHistory;
  }

  public void setIdUserHistory(int idUserHistory) {
    this.idUserHistory = idUserHistory;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
    
}
