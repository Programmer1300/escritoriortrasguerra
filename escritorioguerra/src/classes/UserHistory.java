package classes;

public class UserHistory {

    private int idUserHistory;
    private String username;
    private String datetimeIn;
    private String datetimeOut;
    private String url;

    public UserHistory() {
    }

    public UserHistory(int idUserHistory, String username, String datetimeIn, String datetimeOut, String url) {
        this.idUserHistory = idUserHistory;
        this.username = username;
        this.datetimeIn = datetimeIn;
        this.datetimeOut = datetimeOut;
        this.url = url;
    }

    public int getIdUserHistory() {
        return idUserHistory;
    }

    public void setIdUserHistory(int idUserHistory) {
        this.idUserHistory = idUserHistory;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDatetimeIn() {
        return datetimeIn;
    }

    public void setDatetimeIn(String datetimeIn) {
        this.datetimeIn = datetimeIn;
    }

    public String getDatetimeOut() {
        return datetimeOut;
    }

    public void setDatetimeOut(String datetimeOut) {
        this.datetimeOut = datetimeOut;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
}
