package Models;

import java.time.format.DateTimeFormatter;

public class Usuario {
    public String Username;
    public String Latitude;
    public String Longitude;
    public int  DataAcesso;

    public Usuario(String username, String latitude, String longitude, int dataAcesso) {
        Username = username;
        Latitude = latitude;
        Longitude = longitude;
        DataAcesso = dataAcesso;
    }

    public Usuario() {

    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public int getDataAcesso() {
        return DataAcesso;
    }

    public void setDataAcesso(int dataAcesso) {
        DataAcesso = dataAcesso;
    }
}
